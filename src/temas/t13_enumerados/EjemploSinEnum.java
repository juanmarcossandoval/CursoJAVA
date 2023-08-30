package temas.t13_enumerados;

import temas.t10_TryCatch.ConsoleUtils;

public class EjemploSinEnum {
    public static void main(String[] args) {
        
        Persona arreglo[] = new Persona[4];
        
        ConsoleUtils.imprimir("Ingreso de datos..");
        for(int i = 0; i < arreglo.length; i++) {
            //primero crea una persona vacia
            Persona p = new Persona();
            //leemos por consola cada uno de los atributos
            p.setNombre(ConsoleUtils.leerCadena("Ingrese nombre: "));
            p.setApellido(ConsoleUtils.leerCadena("Ingrse apellido: "));
            p.setTipoIdentificacion(ConsoleUtils.leerCadena("Ingrese tipo de identificacion: "));
            p.setNumIdentificacion(ConsoleUtils.leerCadena("Ingrese el numero de identificacion: "));
            
            arreglo[i] = p;
        }
        
        for (int j = 0 ; j < arreglo.length; j ++){
            System.out.println(arreglo[j]);
        }
        
        for (int z = 0 ; z < arreglo.length; z++) {
            //consigo el tipo de identificacion de la persona y lo comparo con "DNI"
            if (arreglo[z].getTipoIdentificacion().equals("DNI")){
                //SI ES IGUAL A "DNI" LA IMPRIMO
                System.out.println(arreglo[z]);
            }
        }
    }
}
