package temas.t10_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProbandoAnimalFantastico {
    public static void main(String[] args) {
        AnimalFantastico dragon = new AnimalFantastico("Smoug", "doncellas", "recontra");
        try{
            dragon.hacerTruco();
        } catch (UnsupportedOperationException e){
            System.out.println("El dragon no sabe hacer trucos");
        }
        
        int a = 2;
        int b = 0;
        //int resultado = a/b;
        int resultado;
        try{
            resultado = a/b;
        } catch ( ArithmeticException e){
            if (b == 0){
                System.out.println("No se puede dividir por 0");
            }
        }
        
        int arreglo[] = new int [3];
        try {
            arreglo[4]= 3;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Se intento acceder a un indice mayor que la longitud del arreglo");
        }        
        
        System.out.println("El programa termino");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero decimal: ");
        double leido;
        try {
            leido = sc.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("No es un valor legible como numero decimal...");
        } finally {
            System.out.println("Aca termina el programa");
        }
    }
}
