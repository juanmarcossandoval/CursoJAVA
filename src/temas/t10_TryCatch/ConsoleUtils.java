package temas.t10_TryCatch;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtils {

    public static void main(String[] args) {
        Integer miNumero = null;
        int intentos = 0;
        while (intentos < 3){
            miNumero = leerEntero("por favor ingrese su edad: ");
            if (miNumero != null) {
                System.out.println("Mi es edad es: " + miNumero);
            }
            intentos ++;
        } 
        if (intentos == 3) 
            System.err.println("Excedio la cantidad de intentos querido usuario");
        /*while (miNumero == null) {
            miNumero = leerEntero("por favor ingrese su edad: ");
            if (miNumero != null) {
                System.out.println("Mi es edad es: " + miNumero);
            }
        }*/
    }

    public static void imprimir(String msg) {
        System.out.println(msg);
    }

    public static String leerCadena(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public static String leerCadena(String msg) {
        imprimir(msg);//Pór favor ingrese...
        return leerCadena();
    }

    public static Double leerDecimal(String msg) {
        imprimir(msg);// ingrese su sueldo: 
        Scanner sc = new Scanner(System.in);

        try {
            Double numeroLeido = sc.nextDouble(); // esto puede fallar si el usuario ingresa mal el dato
            return numeroLeido;
        } catch (Exception ex) {
            System.out.println("Ocurrio un error leyendo el dato desde consola");
            return null;
        }
    }

    public static Integer leerEntero(){
        Scanner sc = new Scanner(System.in);
        try {
            Integer numeroLeido = sc.nextInt();
            return numeroLeido;
        } catch (InputMismatchException ex) {
            System.out.println("Ocurrio un error al leer el dato numerico");
            //ex.printStackTrace();
            //System.out.println("");
            return null;
        }
    }
    
    public static Integer leerEntero(String msg) {
        imprimir(msg);
        return leerEntero();
    }
    
    public static BigDecimal leerBigDecimal(String msg){
        imprimir(msg);
        String lectura = leerCadena();
        BigDecimal numLeido; 
        try {
            numLeido = new BigDecimal(lectura);
            return numLeido;
        } catch (NumberFormatException ex){
            System.out.println("No se pudo leer correctamente el numero..");
        }
        return null;
    }
}
