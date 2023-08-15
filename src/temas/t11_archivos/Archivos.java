package temas.t11_archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

    public static void main(String[] args) {
        boolean operacionExitosa = false;
        try {
            File archivo = new File("miarchivo2.txt");//  variable de tipo ARCHIVO
            FileWriter fw = new FileWriter(archivo,true); // variable para escribir en el archivo
            /*
                el parametro "append" si esta en true edita el archivo, es decir agrega lineas nuevas al final, 
                conservando el contenido anterior.
                Si esta en false directamente crea un archivo nuevo y si existe uno con el mismo nombre lo pisa, 
                perdemos el contenido anterior
            */
            
            fw.write("mi primer archivo \n"); // escribimos una linea en el archivo
            for (int i = 0; i < 10; i++) {
                fw.write("agrego la linea numero: " + i + "\n");
            }
            
            fw.close(); // llamamos al metodo close para cerrar el archivo
            operacionExitosa = true;
        } catch (Exception e) {
            System.out.println("FALLO AL CREAR EL ARCHIVO DE TEXTO");// informamos el error al usuario
            e.printStackTrace(); // imprimimos la ruta de la excepcion
        } finally {
            if (operacionExitosa) {
                System.out.println("El archivo se creo/edito con exito");
            } 
        }

    }

}
