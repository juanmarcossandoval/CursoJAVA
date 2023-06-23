package temas.lecturaDesdeConsola;

import java.util.Scanner;

public class lecturaDecimales {
    
    public static void main(String[] args) {
        //esto es un objeto para leer de consola
        Scanner consola = new Scanner(System.in);
        //le ponemos un cartelito al usuario para que sepa que tiene que escribir
        System.out.println("Utilizando una coma como separador decimal");
        System.out.println("Por favor ingrese un numero decimal: ");
        //leemos el numero y lo guardamos en la variable
        Double decimalIngresado = consola.nextDouble();
        System.out.println("Decimal ingresado: " + decimalIngresado);
    }
}
