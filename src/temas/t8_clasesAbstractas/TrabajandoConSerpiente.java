
package temas.t8_clasesAbstractas;


public class TrabajandoConSerpiente {
    public static void main(String[] args) {
        Serpiente ser = new Serpiente(false,true,true,"carlitos","huevos","si");
        ser.MorderOPicar();
        ser.setEsVenenosa(true);
        ser.MorderOPicar();
        ser.setEsVenenosa(false);
        ser.setTieneVeneno(false);
        ser.setEstaEnTierra(false);
        ser.setNombre("juan");
        ser.setComidaFavorita("ratones");
        ser.setEsExotica("no");
        System.out.println("serpiente: " + ser);
        System.out.println(ser.esVenenosa() + ";" + ser.tieneVeneno() + ";" + ser.estaEnTierra() + ";" + ser.getNombre() + ";" + ser.getComidaFavorita() + ";" + ser.getEsExotica() + ".");
    }
}
