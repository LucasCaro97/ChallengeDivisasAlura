import java.util.List;

public class Operacion {

    private Divisa MonedaInicial;
    private Divisa MonedaFinal;
    private double Monto;

    public Operacion(Divisa monedaInicial, Divisa monedaFinal, double monto) {
        MonedaInicial = monedaInicial;
        MonedaFinal = monedaFinal;
        Monto = monto;
    }

    public Divisa getMonedaInicial() {
        return MonedaInicial;
    }

    public void setMonedaInicial(Divisa monedaInicial) {
        MonedaInicial = monedaInicial;
    }

    public Divisa getMonedaFinal() {
        return MonedaFinal;
    }

    public void setMonedaFinal(Divisa monedaFinal) {
        MonedaFinal = monedaFinal;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        Monto = monto;
    }

    public double RealizarConversion(){

        double montoFinal = 0;

        if(getMonedaInicial().getNombre().equals("Peso Argentino") && getMonedaFinal().getNombre().equals("Peso Argentino")){
            return montoFinal = getMonto();
        }
        if(getMonedaInicial().getNombre().equals("Peso Argentino") && getMonedaFinal().getNombre().equals("Dolar")){
                return montoFinal = getMonto() / getMonedaFinal().getCambio();
        }
        if(getMonedaInicial().getNombre().equals("Peso Argentino") && getMonedaFinal().getNombre().equals("Euro")){
            return montoFinal = getMonto() / getMonedaFinal().getCambio();
        }
        if(getMonedaInicial().getNombre().equals("Peso Argentino") && getMonedaFinal().getNombre().equals("Libra Esterlina")){
            return montoFinal = getMonto() / getMonedaFinal().getCambio();
        }
        if(getMonedaInicial().getNombre().equals("Peso Argentino") && getMonedaFinal().getNombre().equals("Yen Japones")){
            return montoFinal = getMonto() / getMonedaFinal().getCambio();
        }
        if(getMonedaInicial().getNombre().equals("Peso Argentino") && getMonedaFinal().getNombre().equals("Won sul-coreano")){
            return montoFinal = getMonto() / getMonedaFinal().getCambio();
        }
        if(getMonedaInicial().getNombre().equals("Dolar") && getMonedaFinal().getNombre().equals("Peso Argentino")){
            return montoFinal = getMonto() * getMonedaInicial().getCambio();
        }
        if(getMonedaInicial().getNombre().equals("Euro") && getMonedaFinal().getNombre().equals("Peso Argentino")){
            return montoFinal = getMonto() * getMonedaInicial().getCambio();
        }
        if(getMonedaInicial().getNombre().equals("Libra Esterlina") && getMonedaFinal().getNombre().equals("Peso Argentino")){
            return montoFinal = getMonto() * getMonedaInicial().getCambio();
        }
        if(getMonedaInicial().getNombre().equals("Yen Japones") && getMonedaFinal().getNombre().equals("Peso Argentino")){
            return montoFinal = getMonto() * getMonedaInicial().getCambio();
        }
        if(getMonedaInicial().getNombre().equals("Won sul-coreano") && getMonedaFinal().getNombre().equals("Peso Argentino")){
            return montoFinal = getMonto() * getMonedaInicial().getCambio();
        }
    return montoFinal;
    }

}
