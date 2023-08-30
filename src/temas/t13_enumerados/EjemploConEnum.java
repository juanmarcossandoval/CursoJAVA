
package temas.t13_enumerados;

import temas.t10_TryCatch.ConsoleUtils;

public class EjemploConEnum {
    public static void main(String[] args) {
        
        PersonaEnum arreglo[] = new PersonaEnum[4];
        
        ConsoleUtils.imprimir("Ingreso de datos..");
        for(int i = 0; i < arreglo.length; i++) {
            //primero crea una persona vacia
            PersonaEnum p = new PersonaEnum();
            //leemos por consola cada uno de los atributos
            p.setNombre(ConsoleUtils.leerCadena("Ingrese nombre: "));
            p.setApellido(ConsoleUtils.leerCadena("Ingrse apellido: "));
            p.setTipoIdentificacion(elegirTipoIdentificacion());
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
    
    private static TiposIdentificaciones elegirTipoIdentificacion(){
        //el metodo values nos devuelve un arreglo con los tipos listados
        
        TiposIdentificaciones listaOpciones[] = TiposIdentificaciones.values();
        for (int i = 0; i < listaOpciones.length; i++){
            System.out.println(i + ")" + listaOpciones[i]);
        }
        
        int opcion = ConsoleUtils.leerEntero("elija una opcion: ");
        while (opcion < 0 || opcion > 6){
            ConsoleUtils.imprimir("opcion invalida");
            opcion = ConsoleUtils.leerEntero("elija una opcion: ");
        }
        //recorre la lista de opciones
        for (int i = 0; i < listaOpciones.length; i++) {
            //compara la opcion elegida con la posicion del enum
            if (listaOpciones[i].ordinal() == opcion){
                //si son iguales retorna el enum elegido
                return listaOpciones[i];
            }
        }
        return null;
    }
}
