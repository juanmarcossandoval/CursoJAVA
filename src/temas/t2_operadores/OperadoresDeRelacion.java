package temas.t2_operadores;

public class OperadoresDeRelacion {
    
    public static void main(String[] args) {
        /**
         * Realizan comparaciones entre datos compatibles de tipos primitivos 
         *(numéricos, carácter y booleanos) teniendo siempre un resultado booleano. 
         * Los operandos booleanos sólo pueden emplear 
         * los operadores de igualdad y desigualdad.
         */
        
        boolean bandera = false;
        System.out.println("Bandera original: " + bandera);
        
        bandera = ( 7 == 38);
        System.out.println("Bandera 7 == 38 " + bandera);
        
        bandera = ( 7 != 38);
        System.out.println("Bandera 7 != 38 " + bandera);
        
        bandera = ( 7 < 38);
        System.out.println("Bandera 7 <  38 " + bandera);
        
        bandera = ( 7 > 38);
        System.out.println("Bandera 7 >  38 " + bandera);
        
        bandera = ( 7 <= 38);
        System.out.println("Bandera 7 <= 38 " + bandera);
        
        bandera = ( 7 >= 38);
        System.out.println("Bandera 7 >= 38 " + bandera);
        
        bandera = ( 7 <= 7);
        System.out.println("Bandera 7 <= 7  " + bandera);
        
        bandera = ( 7 >= 7);
        System.out.println("Bandera 7 >= 7  " + bandera);
        
        
    }
}
