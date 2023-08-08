
package temas.t8_clasesAbstractas;


public class TrabajandoConSerpiente {
    public static void main(String[] args) {
        Serpiente Se = new Serpiente(false,true,true,"carlitos","huevos","si");
        Se.MorderOPicar();
        Se.setEsVenenosa(true);
        Se.MorderOPicar();
    }
}
