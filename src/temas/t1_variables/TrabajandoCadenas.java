package temas.t1_variables;

public class TrabajandoCadenas {

    public static void main(String[] args) {

        /* JAVA como todos los lenguajes tiene una forma de realizar salidas de
           de texto en la consola...
         */
        System.out.println("Hola Mundo"); //usando literal de texto

        //Si deseamos mostrar el contenido de una variable de tipo cadena 
        String cadena = "Mi cadena de texto";
        System.out.println(cadena); // usando variable de tipo cadena

        /*  CONCATENACION
            En las cadenas utilizamos el simbolo "+" para realizar la operacion
            de concatenacion. Es decir adherir el contenido de una cadena a otra
            Veamos un ejemplo
            
         */
        String saludo = "Hola";
        String nombre = "Juan Marcos";
        String apellido = "Sandoval";
        
        //imprimamos las cadenas por separado
        System.out.println(saludo);
        System.out.println(nombre);
        System.out.println(apellido);
        
        //ahora concatenaremos las variables en una sola oracion
        String miVariableConcatenada = saludo + " " + nombre + " " + apellido;
        System.out.println(miVariableConcatenada);
        
        /** CONTEXTO CADENA EN JAVA **/
        // Si deseamos imprimir un conjunto de numeros y cadenas de texto
        // tendremos que tener en cuenta ciertas particularidades
        
        System.out.println(2 + 4 + "Hola mundo");
        // en este caso los numeros son tratados como tal
        
        System.out.println("Hola mundo " + 2 + 4);
        /** al comenzar la expresion como texto los numeros seran tratados como
        * texto tambien, para evitar esta particularidad es necesario el uso de
        * parentisis, lo que realizara primero la operacion de suma, una vez
        * obtenido el resultado lo concatenara con el texto inicial **/
        
        System.out.println("Hola mundo " + (2 + 4));      
    }
}
