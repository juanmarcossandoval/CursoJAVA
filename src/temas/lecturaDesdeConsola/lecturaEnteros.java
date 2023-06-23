package temas.lecturaDesdeConsola;

import java.util.Scanner;

public class lecturaEnteros {
    
    public static void main(String[] args) {
        //esto es un objeto para leer de consola
        Scanner consola = new Scanner(System.in);
        //le ponemos un cartelito al usuario para que sepa que tiene que escribir
        System.out.println("Por favor ingrese un entero: ");
        //leemos el numero y lo guardamos en la variable
        int numeroIngresado = consola.nextInt();
        System.out.println("Entero ingresado: " + numeroIngresado);
    }
 
}
