package temas.t3_sentenciasDeControl;

public class DecisionOCondicional {

    public static void main(String[] args) {
        /**
         * Son sentencias que nos permiten tomar una decisión para poder
         * ejecutar un bloque de sentencias u otro
         */

        int a = 1;
        int b = 2;

        // si se cumple la sentencia logica ejecuta el bloque de codigo
        if (a > 0) {
            System.out.println("A es mayor a 0");
        }

        // si se cumple la sentencia logica ejecuta el primer bloque de codigo
        // si no se cumple ejecuta el segundo bloque de codigo -> sale por el else
        if ((b % 2) == 0) {
            System.out.println("B es par");
        } else {
            System.out.println("B es impar");
        }

        //CONDICIONALES ANIDADOS
        if (a > b) { // si se cumple la primera sentencia
            System.out.println("A es mayor que B");
        } else if (a < b) { // si no -> evalua la segunda sentencia
            System.out.println("A es menor que B");
        } else { // si no se cumple la segunda tampoco entonces ->
            System.out.println("A y B son iguales");
        }

        //SWITCH
        /*
            Para los casos en los que se tienen muchas ramas o caminos 
            de ejecución en una sentencia if tenemos la sentencia switch. 
            La sentencia switch evalúa una expresión y ejecutará el bloque 
            de sentencias que coincida con el valor de la expresión.
            EN LO POSIBLE EVITAR SU USO
            ya que el codigo se vuelve largo y tedioso
        */
        int num_dia = 2;
        switch (num_dia) { //segun el valor de num_dia
            case 1: //en el caso que sea igual a uno imprime Lunes
                System.out.println("Lunes");
                break;
            case 2: //en el caso que sea igual a dos imprime Martes
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: // en el caso que no coincida con ninguna de las anteriores
                System.err.println("No es una opcion valida");
        }
        // las condiciones se pueden agrupar
        int numero = 11;
        switch (numero) {
            case 0,2,4,6,8: // si numero es igual a 0, 2, 4, 6 u 8
                System.out.println("El numero es par");
                break;
            case 1,3,5,7,9: // si numero es igual a 1, 3, 5, 7 o 9 
                System.out.println("El numero es impar");
                break;
            default: // si no es ninguno de los casos anteriores
                System.out.println("No es un numero valido");
        }
    }
}
