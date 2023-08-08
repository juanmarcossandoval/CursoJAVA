
package temas.t8_clasesAbstractas;


public class TrabajandoConPerro {
    public static void main(String[] args) {
        Perro Pe = new Perro("caniche","rojo","thelordtho","hotdogs","no");
        Pe.hacerTruco();
        System.out.println("Nombre: " + Pe.getNombre());
        System.out.println("todo: " + Pe);
    }
}
