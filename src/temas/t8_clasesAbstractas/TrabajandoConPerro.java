
package temas.t8_clasesAbstractas;


public class TrabajandoConPerro {
    public static void main(String[] args) {
        Perro per = new Perro("caniche","rojo","thelordtho","hotdogs","no");
        per.hacerTruco();
        System.out.println("todo:");
        System.out.println(per);
        per.setRaza("Bulldog");
        per.setColor("Blanco");
        per.setNombre("rocco");
        per.setComidaFavorita("carne");
        per.setEsExotica("si");
        System.out.println("perrooo: \n" + per);
        
        System.out.println(per.getRaza()+ ";" + per.getColor() + ";" + per.getNombre() + ";" + per.getComidaFavorita() + ";" + per.getEsExotica() + "." );
    }
}
