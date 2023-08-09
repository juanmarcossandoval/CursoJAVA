package temas.t8_clasesAbstractas;

public class TrabajandoConGato {
    public static void main(String[] args) {
        Gato g = new Gato(8,true,3,"juanito","pescadito","si");
        System.out.println(g);
        System.out.println("");
        Mascota m = new Gato(7,true,3,"panchito","pescadito","si");
        System.out.println(m);
    }
}
