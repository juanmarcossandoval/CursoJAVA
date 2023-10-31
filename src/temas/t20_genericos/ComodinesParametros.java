package temas.t20_genericos;

import java.util.List;

public class ComodinesParametros {
    
    public static void mostrarLista(List<? extends Number> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posicion " + i + " = " + lista.get(i));
        }
    }
    
}
