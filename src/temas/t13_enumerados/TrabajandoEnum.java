package temas.t13_enumerados;

public class TrabajandoEnum {

    public static void main(String[] args) {
        //variable de tipo enum
        TiposIdentificaciones miEnum = TiposIdentificaciones.DNI;

        //si quiero tener una lista puedo recurrir al metodo values()
        TiposIdentificaciones arreglo[] = TiposIdentificaciones.values();

        int posicion = TiposIdentificaciones.DNI.ordinal();
        System.out.println(posicion);
        posicion = TiposIdentificaciones.CUIT.ordinal();
        System.out.println(posicion);
        posicion = TiposIdentificaciones.CUIL.ordinal();
        System.out.println(posicion);
        posicion = TiposIdentificaciones.PASAPORTE.ordinal();
        System.out.println(posicion);
    }

}
