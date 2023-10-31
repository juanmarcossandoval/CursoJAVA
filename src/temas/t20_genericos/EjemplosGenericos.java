package temas.t20_genericos;

import java.util.Arrays;
import java.util.List;

public class EjemplosGenericos {
    public static void main(String[] args) {
        /*List<String> lista = new ArrayList<>();
        lista.add("hola");
        //lista.add(1);
        
        String elemento0 = lista.get(0);
        System.out.println(elemento0);
        
        Generico<String> genericoCadena = new Generico("hola mundo");
        genericoCadena.mostrarTipo();
        
        Generico<Integer> genericoEntero = new Generico(2);
        genericoEntero.mostrarTipo();*/
        
        GenericoAcotado<Integer> acotadoEntero = new GenericoAcotado(2);
        acotadoEntero.mostrarTipo();
        
        //GenericoAcotado<String> acotadoCadena = new GenericoAcotado("Hola mundo");
        
        List<Integer> listaEnteros = Arrays.asList(1,2,3,4);
        ComodinesParametros.mostrarLista(listaEnteros);
    }
}
