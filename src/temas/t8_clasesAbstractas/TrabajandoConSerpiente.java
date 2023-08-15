
package temas.t8_clasesAbstractas;


public class TrabajandoConSerpiente {
    public static void main(String[] args) {
        Serpiente Se = new Serpiente(false,true,true,"carlitos","huevos","si");
        Se.MorderOPicar();
        Se.setEsVenenosa(true);
        Se.MorderOPicar();
        Se.setEsVenenosa(false);
        Se.setTieneVeneno(false);
        Se.setEstaEnTierra(false);
        Se.setNombre("juan");
        Se.setComidaFavorita("ratones");
        Se.setEsExotica("no");
        System.out.println("serpiente: " + Se);
        System.out.println(Se.esVenenosa() + ";" + Se.tieneVeneno() + ";" + Se.estaEnTierra() + ";" + Se.getNombre() + ";" + Se.getComidaFavorita() + ";" + Se.getEsExotica() + ".");
    }
}
