
package temas.t8_clasesAbstractas;


public class TrabajandoConPerro {
    public static void main(String[] args) {
        Perro Pe = new Perro("caniche","rojo","thelordtho","hotdogs","no");
        Pe.hacerTruco();
        System.out.println("todo: " + Pe);
        Pe.setRaza("Bulldog");
        Pe.setColor("Blanco");
        Pe.setNombre("rocco");
        Pe.setComidaFavorita("carne");
        Pe.setEsExotica("si");
        System.out.println("perrooo: " + Pe);
        
        System.out.println(Pe.getRaza()+ ";" + Pe.getColor() + ";" + Pe.getNombre() + ";" + Pe.getComidaFavorita() + ";" + Pe.getEsExotica() + "." );
    }
}
