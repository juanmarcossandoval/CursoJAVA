package temas.t1_variables;

public class TrabajandoVariables {
    /**
     * ¿Que es una variable?
     * Una variable es una direccion de memoria donde se guardan datos de
     * distinto tipo. 
     */
    
     /** Cada vez que declaramos una variable, java reserva un espacio de memoria 
     * de determinado tamaño dependiendo del tipo de variable.
     */
    
    /**
     * Se llaman variables ya que su valor puede cambiar con el correr de las 
     * instrucciones que ejecute nuestro programa.
     */
    
    // EXISTEN 2 TIPOS DE VARIABLES
    
    
    /*******************PRIMITIVAS*******************/
    /** Las variables primitivas comienzan siempre con minusculas **/
    
    /**booleanas**/
    //ocupan 1 bit -> pueden tomar el valor de verdadero(1) o falso(0);
    boolean bandera = true;
    boolean bandera2 = false;
    
    /**char -> caracteres**/
    //ocupan 16 bits -> guardan 1 solo caracter
    char caracter = 'a';
    
    /**int (intiger) -> numeros enteros**/
    //ocupan 32 bits
    int entero = 1 ;
    
    /**long -> numeros enteros**/
    //ocupan 64 bits -> el doble que los int
    long enterosGrandes = 1 ;
    
    /**float -> numeros con coma**/
    //ocupan 32 bits
    float decimales = 2.0f;
    
    /**double -> numeros con coma**/
    //ocupan 64 bits -> el doble que los float
    double decimalesGrandes = 2.0;
    
    /*******************CLASES*******************/
    /** Las clases comienzan siempre con mayusculas **/
    /** String -> Las cadenas de texto siempre van entre comillas**/
    String cadena = "Hola Mundo";
    
    /**
     * ¿Como se declaran las variables?
     * TIPO IDENTIFICADOR (ej: int miVariable)
     * el identificador es el nombre que le asignemos a la variable.
     */
    
    /** ¿Que es la inicializacion de variables?
     * La inicializacion no es mas que la accion de darle un valor por primera 
     * vez a una variable (ej: miVariable = 2;).
     */
    
    /** ¿Cuales son las restriccion al momento de nombrar una variable?. */
    
    //No puede usar caracteres especiales a excepcion de dos "_" y "$"
    int mi_variable = 2;
    int _miVariable = 2; 
    int $miVariable = 2;
    int mi$variable = 2;
    
    //no puede comenzar con un numero, pero si tener un nombre alfanumerico
    int miNumero2 = 2;
    //int 2miNumero = 2; -> esto esta prohibido
    
    //no es recomendable, usar signos especiales, ya que dependiendo del juego
    //de caracteres utilizado por el sistema operativo o proyecto puede producir fallos
    int miVáriable = 2;
    int año = 0;
    
    //no se pueden utilizar palabras reservadas de JAVA como nombre de variable
    //int int = 2; -> esto esta prohibido
    /**************** INVESTIGAR PALABRAS RESERVADAS DE JAVA ****************/
    
    //En java por convencion se utiliza la notacion de CamelCase
    //es decir cada palabra debe comenzar con mayuscula
    /************ INVESTIGAR OTRAS CONVENCIONES DE NOTACIONES ************/
}
