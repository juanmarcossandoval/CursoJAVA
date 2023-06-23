package temas.t3_sentenciasDeControl;

public class Bucles {
    
    public static void main(String[] args) {
        /********************* BUCLE FOR *********************/
        /** este bucle es utilizado cuando sabemos la cantidad de repeticiones
        de antemano**/
        
        // empeza a contar desde 0; 
        // mientras el valor de i sea menor a 10 ejecuta el codigo;
        // despues incrementa a i en 1 paso
        System.out.println("Ejemplo FOR:");
        for (int indice = 1; indice <= 10; indice++) {
            System.out.println("Valor del indice: " + indice);
        }
        
        /********************* BUCLE WHILE *********************/
        /** este bucle es utilizado cuando no sabemos a ciencia cierta 
         * la cantidad de repeticiones que deberemos concretar.
         * debe tener una condicion de corte bien definida (bandera) o el bucle
         * iterara hasta que detengamos el programa manualmente
        **/
        System.out.println("Ejemplo WHILE:");
        int indice = 0;
        
        while (indice < 10 ) { 
            System.out.println("El valor de mi bandera es:" + indice);
            indice = indice + 1;
        }
        
        /********************* BUCLE DO WHILE *********************/
        /** este bucle es utilizado de igual manera que el While con la 
         * diferencia que la condicion es evaluada al final, por lo tanto
         * se ejecutara al menos una vez.. veamos un ejemplo:
        **/
        System.out.println("Ejemplo DO WHILE");
        indice = 11;
        do {            
            System.out.println("El valor del indice es: " + indice);
        } while (indice < 10);
        //Observemos que a pesar de 11 ser mayor a 10 y no cumplirse la condicion
        //se imprime de todas maneras el 11 por consola
    }
}
