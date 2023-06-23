package temas.t2_operadores;

public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        /**
         * Contamos con 5 operadores aritmeticos
         * suma + 
         * resta - 
         * multiplicacion '*"
         * division / 
         * modulo %
         */
        
        int a = 2;
        int b = 7;
        
        int suma = a + b;
        System.out.println("Suma: " + suma);
        
        int resta = a - b;
        System.out.println("Resta: " + resta);
        
        int multiplicacion = a * b;
        System.out.println("Multiplicacion: " + multiplicacion);
        
        int division = a / b;
        System.out.println("Division: " + division);
        
        int modulo = a % 2; 
        // guarda el resto de la division entera 
        System.out.println("Modulo: " + modulo);
        
        /** operadores de incremento y decremento **/
        
        int c = 10;
        System.out.println("c: " + c);
        
        c = c + 1;
        System.out.println("c+1: " + c); 
        
        c++; //incrementa en 1 el valor de c al igual que el caso anterior
        System.out.println("c++: " + c);
        
        int d = 10;
        System.out.println("d: " + d);
        
        d = d - 1;
        System.out.println("d-1: " + d); 
        
        d--; //decrementa en 1 el valor de d al igual que el caso anterior
        System.out.println("d--: " + d);
               
    }
 
}
