package temas.t19_Listas;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import temas.t8_clasesAbstractas.Mascota;

public class TrabajandoConListas {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList(); // mas utilizado
        //numeros = new LinkedList<>();
        //numeros = new Vector<>();
        //ArrayList<Integer> lista = new ArrayList<>();
        Integer numA = 9;
        Integer numB = 2;
        Integer numC = 5;
        Integer numD = 10;
        
        numeros.add(numA);
        numeros.add(numB);
        numeros.add(numC);
        
        System.out.println("Tamaño de lista: " + numeros.size());
        
        imprimirLista(numeros);
        System.out.println("primer elemento: " + numeros.get(0));
        
        numeros.remove(numA);
        System.out.println("removemos el 9:");
        imprimirLista(numeros);
        
        numeros.remove(0);
        System.out.println("removemos el primer elemento: ");
        imprimirLista(numeros);
        
        numeros.add(numA);
        numeros.add(numB);
        System.out.println("agregamos todos los numeros de nuevo: ");
        imprimirLista(numeros);
        System.out.println("agregamos el 10: ");
        numeros.add(numD);
        imprimirLista(numeros);
        
        
        List<Integer> numerosParaEliminar = new ArrayList<>();
        numerosParaEliminar.add(numA);
        numerosParaEliminar.add(numB);
        numerosParaEliminar.add(numC);
        
        numeros.removeAll(numerosParaEliminar);
        System.out.println("Lista despues de remove all: ");
        imprimirLista(numeros);
        System.out.println("tamaño de la lista: " + numeros.size());
        
        if (numeros.isEmpty()){
            System.out.println("La lista esta vacia");
        } else {
            System.out.println("La lista tiene contenido");
        }
        
        if (numeros.contains(numD)){
            System.out.println("si contiene el 10");
        }
        
        List<Persona> listaPersonas = new ArrayList<Persona>();
        Persona a = new Persona("Juanito", "Sandoval");
        listaPersonas.add(a);
        
        for (Persona p : listaPersonas){
            System.out.println(p);
        }
        
    }
    
    private static void imprimirLista(List<Integer> lista){
        //i es un (puntero) iterador
        for (Integer i : lista){
            System.out.println("valor: " + i);
        }
    }
}
