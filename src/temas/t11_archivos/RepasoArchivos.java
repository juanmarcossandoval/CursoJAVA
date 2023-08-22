package temas.t11_archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import temas.t8_clasesAbstractas.Circulo;

public class RepasoArchivos {
    
    public static void main(String[] args) {
        File archivo = new File("miArchivoParaEdicion.txt");
        try {
            FileWriter fw = new FileWriter(archivo,true);//cuando esta true permite la edicion
            
            Circulo c = new Circulo(57.58);            
            //c.getRadio(); c.calcularPerimetro(); c.calcularSuperficie();
            String linea = "radio: " + c.getRadio() 
                    + " perimetro: " + c.calcularPerimetro() 
                    + " superficie: " + c.calcularSuperficie() + "\n";
            
            
            fw.write(linea);
            fw.close();
            System.out.println("Su archivo se creo/edito exitosamente");
        } catch (IOException ex) {
            System.out.println("Ocurrio un error leyendo/creando el archivo");
        }
    }
}
