package temas.t5_metodos;

import java.util.Scanner;

public class FuncionesMetodosProcedimientos {
    //METODO MAIN
    public static void main(String[] args) {
        // metodos sin retorno o de tipo VOID
        imprimir();//metodo sin parametros
        //podemos enviar literales como parametros
        imprimir("Usando parametros");
        
        //podemos enviar variables como parametros
        String variable = "Valor por parametro desde variable";
        imprimir(variable);
        
        /* SOBRECARGA: el metodo siempre se llama imprimir pero dependiendo 
        de si recibe uno, dos o ningun parametro o del tipo de parametro 
        ingresado en la invocacion, utilizara el metodo que correspondiese */
        imprimir(2);
        // -> invoca al metodo que recibe un entero como argumento
        imprimir("Esto es sobrecarga", variable);
        //-> invoca al metodo imprimir que recibe dos cadenas como argumentos
        
        // metodos con retorno
        // guardamos el retorno en una variable
        int resultado = sumar(2,3);//-> literales como parametros
        System.out.println("Suma: " + resultado);
        
        //consumimos el retorno en un parametro de otro metodo(System.out.println)
        System.out.println("Suma: " + sumar(3,3));//-> literales como parametros
        
        int a = 5; int b = 7;
        System.out.println("Suma: " + sumar(a, b));//-> variables como parametros
        
        // guardamos el retorno en una variable
        int resultadoSuma = sumar(a, b);//-> variables como parametros
        System.out.println("SUMA: " + resultadoSuma);
    
        //consumir el retorno en sentencias condicionales
        if (sonIguales(a, b)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
        
        if (sumar(a, b) > 0){
            System.out.println("El resultado es positivo");
        } else {
            System.out.println("El resultado es negativo");
        }
        //metodos anidados
        int enteroLeido = leerEntero();
        System.out.println("El numero ingresado es: " + enteroLeido);
    }
    
    // SOBRECARGA DE METODOS
    private static void imprimir(){
        System.out.println("Mi mensaje desde un metodo");
    }
        
    private static void imprimir(String mensaje){
        System.out.println(mensaje);
    }
    
    private static void imprimir(int num){
        System.out.println(num);
    }
    
    private static void imprimir(String mensaje, String msg){
        System.out.println("Primer mensaje: " + mensaje);
        System.out.println("Segundo mensaje: " + msg);
    }
    
    //METODOS ANIDADOS
    private static int leerEntero(){
        Scanner consola = new Scanner(System.in);
        imprimir("Ingrese un numero:");
        return consola.nextInt();
    }    
    
    private static boolean sonIguales(int a, int b){
        return a == b;
    }
    
    private static int sumar(int a, int b){
        return a + b;
    }
}
