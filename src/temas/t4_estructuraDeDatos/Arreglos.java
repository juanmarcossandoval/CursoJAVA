package temas.t4_estructuraDeDatos;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        /*
            Los arreglos son una estructura de datos que nos permiten guardar 
        una gran cantidad de datos del mismo tipo. Se declaran de la siguiente
        manera: 
            tipo de tato + identificador + corchetes
            int miArregloEnteros[]
            string miArregloCadena[]
        
        Para poder usar el arreglo primero hay que inicializarlo indicandole a 
        JAVA la dimension del mismo o inicializando sus valores
            Opcion 1:
            miArregloEnteros = new int[4] -> al indicar la cantidad entre corchetes
            java reservara espacio en memoria solo para 4 enteros como maximo
        
            Opcion 2:
            miArregloEnteros = {1,2,3,4} -> de esta manera ya "intuye" que debera
            reservar espacio para 4 enteros y a su vez lo inicializa
        */ 
        
        //ARREGLOS DECLARACION E INICIALIZACION OPCION 1;
        int miArregloEntero[];
        miArregloEntero = new int [4]; //hasta aqui lo hemos declarado
        
        // veamos como inicializar sus valores:
        miArregloEntero[0] = 1; 
        /*
        debe ponerse entre corchetes la posicion a la cual queremos inicializar 
        su valor, hay que tener en cuenta que los arreglos en JAVA (como en la 
        mayoria de los lenguajes de programacion) empieza a contar las posiciones
        a partir del 0, a esto le llamaremos indice
        */
        miArregloEntero[1] = 2;//inicializamos el segundo elemento (indice 1) con el valor 2
        miArregloEntero[2] = 3;//inicializamos el tercer elemento (indice 2) con el valor 3
        miArregloEntero[3] = 4;//inicializamos el cuarto elemento (indice 3) con el valor 4
        
        //ARREGLOS DECLARACION E INICIALIZACION OPCION 2;
        int miArreglo[] = {4,5,6,7};
        /*
            De esta manera el arreglo queda declarado e inicializado
            inicializamos el primer elemento (indice 0) con el valor 4
            inicializamos el segundo elemento (indice 1) con el valor 5
            inicializamos el tercer elemento (indice 2) con el valor 6
            inicializamos el cuarto elemento (indice 3) con el valor 7
        
        como podemos observar esta manera de declarar e inicializar un arreglo
        es mucho mas compacta y nos ahorra escribir lineas de codigo pero a fines
        practicos no es muy utilizada
        */

        /* acceder al valor de un elemento del arreglo
        para acceder a un valor de una posicion dada nos apoyaremos en el indice
        */
        System.out.println("El primer elemento de mi arreglo es: " + miArreglo[0]);
        
        /* para imprimir todos los elementos del arreglo podemos utilizar 
        el atributo length que nos devolvera la cantidad de elementos que guarda 
        nuestro arreglo. Pero debemos ser precavidos ya que para acceder a cada
        elemento utilizaremos el INDICE (que empieza a contar desde 0), nuestro 
        arreglo ahora cuenta con 4 elementos, pero los valores disponibles para el
        indicen son "0" "1" "2" o "3" , por ello deberemos restar 1 */
        System.out.println("Mi arreglo cuenta con los siguientes elementos: ");
        for (int i = 0; i <= miArregloEntero.length -1; i++) {
            System.out.println(miArregloEntero[i]);
        }
        
        //utilizando una variable auxiliar para determinar el tamaño de nuestro arreglo
        
        int dimension = 7;
        int nuevoArreglo[] = new int[dimension]; /* -> 7 elementos
            de esta manera si dimension vale 9 por ejemplo ahora java reservara 
            espacio suficiente para 9 enteros
        */
        
        //Inicializando nuestro arreglo desde consola
        Scanner consola = new Scanner(System.in);
        /*utilizamos el atributo length de nuevo
            recuerden que los arreglos cuentan a partir de 0
            para este caso length nos devolvera 7 
            pero la variable i que nos reemplaza el indice ira de 0 a 6
        */     
        
        for (int i = 0; i <= nuevoArreglo.length-1; i++){
            System.out.println("Por favor ingrese un numero para la posicion: " + i);
            nuevoArreglo[i] = consola.nextInt();
        }
        //imprimimos
        for (int i = 0; i <= nuevoArreglo.length-1; i++){
            System.out.println("El elemento en la posicion: " + i + " es " + nuevoArreglo[i]);
        }
    }
}
