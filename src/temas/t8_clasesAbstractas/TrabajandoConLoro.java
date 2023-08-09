package temas.t8_clasesAbstractas;


public class TrabajandoConLoro {
    public static void main(String[] args) {
        Loro l = new Loro(true, 5, "Peludo", "Durazno", "no");
        
        System.out.println("Mi Loro se llama: " + l.getNombre());
        System.out.println("Su comida Favorita es: " + l.getComidaFavorita());
        System.out.println("Es una mascota exotica?: " + l.getEsExotica());
        
        l.hacerTruco();
    }
}
