package temas.t17_String;

public class MetodosStrings {

    public static void main(String[] args) {
        String cadena = "Hola Mundo";

        System.out.println(cadena);

        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());

        String cadena1 = "PEPITO SA";
        String cadena2 = "pepito sa";

        if (cadena1.equals(cadena2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        String cadena3 = "   espacios   ";
        System.out.println(cadena3);
        System.out.println(cadena3.trim());
        System.out.println(cadena3.trim().toUpperCase());

        System.out.println("cadena3 tiene " + cadena3.length() + " letras");
        cadena3 = cadena3.trim().toUpperCase();
        System.out.println("cadena3 tiene " + cadena3.length() + " letras");

        if (cadena3.endsWith("S")) {
            System.out.println("termina con s");
        } else {
            System.out.println("No termina con s");
        }

        if (cadena3.startsWith("ca")) {
            System.out.println("Empieza con ca");
        } else {
            System.out.println("No empieza con ca");
        }

        char arreglo[] = cadena3.toCharArray();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        String cadenaCortada = cadena3.substring(1, 4);
        System.out.println(cadenaCortada);

        String datoDNI = "DI35408772";
        String numero = datoDNI.substring(2);
        String tipoDoc = datoDNI.substring(0, 2);
        System.out.println("Tipo doc: " + tipoDoc);
        System.out.println("Numero: " + numero);

        String CUIT = "20-35408772-4";
        String partes[] = CUIT.split("-");
        System.out.println("cantidad de partes: " + partes.length);
        System.out.println("el dni es " + partes[1]);

        if (CUIT.contains("-")) {
            System.out.println("es un CUIT CUIL");
        } else {
            System.out.println("ES UN DNI");
        }

        String cadenaPlantilla = "El nombre del cliente es: $#nombre#$";
        String miNombre = "JUAN MARCOS";
        System.out.println(cadenaPlantilla.replace("$#nombre#$", miNombre));

        String nombre = "Juan Marcos";
        String apellido = "Sandoval";
        System.out.println(nombre.concat(" ").concat(apellido));
        System.out.println(nombre + " " + apellido);
        System.out.println(nombre.concat(" ").concat(apellido).toUpperCase());
        
        String vacio = "";
        if (vacio.isEmpty()){
            System.out.println("el string esta vacio");
        }
        
        vacio = "   ";
        if (vacio.isBlank()){
            System.out.println("el string esta en blanco");
        }
        
    }

    public static boolean invalidString(String cadena){
        return cadena == null || cadena.isBlank() || cadena.isEmpty(); 
    }
}
