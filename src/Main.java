
import com.sun.source.tree.NewArrayTree;

import javax.swing.*;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {


		DivisaRepositorio divisaRepositorio = new DivisaRepositorio();
		divisaRepositorio.generateDefaultData();
		List<Divisa> divisas = divisaRepositorio.retornarTodos();
		Object divisaFinalCombox = null;
		double montoAConvertir = 0;
		boolean bandera1 = true;
		String entrada = "";
		int resp = 0;

		Object[] possibleValues = {divisas.get(0).getNombre(), divisas.get(1).getNombre(), divisas.get(2).getNombre(), divisas.get(3).getNombre(),
				divisas.get(4).getNombre(), divisas.get(5).getNombre()};

		Object[] possibleValues2 = {divisas.get(0).getNombre()};

		do{

		Object divisaOrigenCombox = JOptionPane.showInputDialog(null, "Elegir la divisa origen", "Input", JOptionPane.QUESTION_MESSAGE, null,
				possibleValues, possibleValues[0]);

			if (!divisaOrigenCombox.equals("Peso Argentino")) {
				divisaFinalCombox = JOptionPane.showInputDialog(null, "Elegir la divisa a convertir", "Input", JOptionPane.QUESTION_MESSAGE, null,
						possibleValues2, possibleValues2[0]);
			} else {
				divisaFinalCombox = JOptionPane.showInputDialog(null, "Elegir la divisa a convertir", "Input", JOptionPane.QUESTION_MESSAGE, null,
						possibleValues, possibleValues[0]);
			}


			do {
				entrada = JOptionPane.showInputDialog("Ingrese el monto a convertir");


				if (entrada.equals("")) {
					bandera1 = false;
					JOptionPane.showMessageDialog(null, "Valor invalido");
				} else {
					for (int i = 0; i < entrada.length(); i++) {
						char c = entrada.charAt(i);
						if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c == ' ' || c == 'ñ' || c == 'Ñ') {
							bandera1 = false;
							JOptionPane.showMessageDialog(null, "Valor invalido");
							break;
						} else {
							bandera1 = true;
						}
					}
				}
			} while (bandera1 == false);

			montoAConvertir = Double.parseDouble(entrada);


			Operacion operacion = new Operacion(divisaRepositorio.retornarDivisa(divisaOrigenCombox), divisaRepositorio.retornarDivisa(divisaFinalCombox), montoAConvertir);


			try {
				JOptionPane.showMessageDialog(null, "Usted tiene " + operacion.RealizarConversion() + " " + divisaFinalCombox);
			} catch (Exception ex) {
				ex.printStackTrace();
			}


			resp = JOptionPane.showConfirmDialog(null, "Desea realizar otra operacion?");
		}
		while(resp == 0);

		JOptionPane.showMessageDialog(null,"Programa Finalizado");

		// System.out.println(mapaDivisas);

		// ITERA EL MAPA CON UN LAMBDA
		// mapaDivisas.forEach((k, v) -> System.out.println("Key: " + k + " Moneda: " +
		// v.getNombre() + " Precio: " + v.getPrecio() ));

		// ITERA USANDO ITERATOR
//        Iterator<Map.Entry<Integer, Divisa>> entries = mapaDivisas.entrySet().iterator();
//        while(entries.hasNext()){
//            Map.Entry<Integer, Divisa> entry = entries.next();
//            System.out.println("Key: " + entry.getKey() + "Divisa: " + entry.getValue());
//        }

//        for (HashMap.Entry<Integer, Divisa> entry : mapaDivisas.entrySet()) {
//            System.out.printf("Clave: %s. Valor: %d\n", entry.getKey(), entry.getValue());
//        }

//
//        Object[] possibleValues = { "De Peso a Dolar", "De Peso a Euro", "De Peso a Libra Esterlina", "De Peso a Yen Japones", "De Peso a Won sul-coreano",
//                                    "De Dolar a Peso", "De Euro a Peso", "De Libra Esterlina a Peso", "De Yen Japones a Peso", "De Won sul-coreano a Peso"};
//
//        Object divisa = JOptionPane.showInputDialog(null,"Elegir la divisa a la que desea convertir","Input",JOptionPane.QUESTION_MESSAGE, null,
//                possibleValues, possibleValues[0]);
//
//        double montoAConvertir = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a convertir"));
//
//        double conversion = montoAConvertir / 371;
//
//        JOptionPane.showMessageDialog(null, "Usted tiene " + conversion + " " + divisa);
//
//        System.out.println(divisa);
//        System.out.println(montoAConvertir);
//

	}
}