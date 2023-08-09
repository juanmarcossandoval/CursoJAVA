package temas.t8_clasesAbstractas;

public class TrabajandoConTortuga {
    public static void main(String[] args) {
        Tortuga t = new Tortuga (true, true, false, "Tita", "Zanahoria", "Si");
        
        System.out.println("Mi Tortuga se llama: " + t.getNombre());
        System.out.println("Su comida Favorita es: " + t.getComidaFavorita());
        System.out.println("Es una mascota exotica?: " + t.getEsExotica());
        t.hibernarOdespertarse();
        t.hibernarOdespertarse();
    }
}
