package temas.t2_operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /**
         * Realizan operaciones sobre datos booleanos 
         * tienen como resultado un valor booleano
         */
        
        boolean verdadero = true;
        boolean falso = false;
        boolean bandera;
        
        /*** OPERADOR DE NEGACION ***/
        //invierte el valor boleano
        System.out.println();
        System.out.println("*** OPERADOR DE NEGACION ***");
        
        bandera = !verdadero;
        System.out.println("!verdadero : "+ bandera);
        
        bandera = !falso;
        System.out.println("!falso : "+ bandera);
        
        /*** OPERADOR OR ***/
        //si al menos uno de los valores es verdadero el resultado es verdadero
        //para que el resultado sea falso ambos valores deben ser falso
        System.out.println();
        System.out.println("*** OPERADOR OR ***");
        
        bandera = verdadero || verdadero;
        System.out.println("verdadero || verdadero : "+ bandera);
        
        bandera = falso || falso;
        System.out.println("falso || falso : "+ bandera);
        
        bandera = verdadero || falso;
        System.out.println("verdadero || falso : "+ bandera);
        
        bandera = falso || verdadero;
        System.out.println("falso || verdadero : "+ bandera);
        
        
        /*** OPERADOR AND ***/
        //si al menos uno de los valores es falso el resultado es falso
        //para que el resultado sea verdadero ambos valores deben ser verdadero
        System.out.println();
        System.out.println("*** OPERADOR AND ***");
        
        bandera = verdadero && verdadero;
        System.out.println("verdadero && verdadero : "+ bandera);
        
        bandera = falso && falso;
        System.out.println("falso && falso : "+ bandera);
        
        bandera = verdadero && falso;
        System.out.println("verdadero && falso : "+ bandera);
        
        bandera = falso && verdadero;
        System.out.println("falso && verdadero : "+ bandera);
        
    }
}
