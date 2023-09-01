package temas.t14_composicion;

import temas.t10_TryCatch.ConsoleUtils;

public class Agenda {
    
    public static void main(String[] args) {
        Contacto c = new Contacto();
        c.setPersona(leerPersona());
        c.setTelefono(leerTelefono());
        c.setDomicilio(leerDomicilio());
        System.out.println("Contacto guardado: ");
        System.out.println(c);
    }
    
    private static Persona leerPersona(){
        //Persona p2 = new Persona(ConsoleUtils.leerCadena("Ingrese el nombre: "),ConsoleUtils.leerCadena("Ingrese el apellido: "));
        Persona p = new Persona();
        p.setNombre(ConsoleUtils.leerCadena("Ingrese el nombre: "));
        p.setApellido(ConsoleUtils.leerCadena("Ingrese el apellido: "));
        return p;
    }
  
    private static Telefono leerTelefono(){
        Telefono t = new Telefono();
        t.setTipo(elegirTipoTelefono());
        t.setNumero(ConsoleUtils.leerCadena("Ingrese un numero de telefono: "));
        return t;
    }
    
    private static TipoTelefono elegirTipoTelefono(){
        TipoTelefono opciones[] = TipoTelefono.values();
        
        for (int i = 0; i < opciones.length; i++){
            System.out.println(i + ")" + opciones[i]);
        }
        
        int opcionElegida = ConsoleUtils.leerEntero("Elija tipo de telefono: ");
        while (opcionElegida < 0 || opcionElegida > opciones.length -1){
            ConsoleUtils.imprimir("OPCION INCORRECTA..");
            opcionElegida = ConsoleUtils.leerEntero("Elija tipo de telefono: ");
        }
        
        for (int i = 0; i < opciones.length; i++){
            if (opciones[i].ordinal() == opcionElegida){
                return opciones[i];
            }
        }
        
        return null;
    }
    
    private static Domicilio leerDomicilio(){
        //TODO: DECLARAR EL OBJETO VACIO
        //TODO: LEER Y SETEAR TODOS SUS ATRIBUTOS
        //TODO: DEVOLVER EL DOMICILIO
        return null;
    }
}
