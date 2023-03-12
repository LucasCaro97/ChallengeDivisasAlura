import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisaRepositorio {

    private List<Divisa> divisaList = new ArrayList<>();

    public DivisaRepositorio(){
        generateDefaultData();
    }

    public void generateDefaultData(){
        divisaList = Arrays.asList( new Divisa("Peso Argentino", 1), new Divisa("Dolar", 200.06),
                new Divisa("Euro", 211.15), new Divisa("Libra Esterlina", 237.06), new Divisa("Yen Japones", 1.46),
                new Divisa("Won sul-coreano", 0.15));
    }

    public List<Divisa> retornarTodos(){
        return this.divisaList;
    }

    public Divisa retornarDivisa(Object divisaNombre){
        for (Divisa divisa : divisaList) {
            if(divisa.getNombre().equals(divisaNombre)){
                return divisa;
            }
        }
        return null;
    }


}

