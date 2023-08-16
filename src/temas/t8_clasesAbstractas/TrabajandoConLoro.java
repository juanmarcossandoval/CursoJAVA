package temas.t8_clasesAbstractas;


public class TrabajandoConLoro {
    public static void main(String[] args) {
        Loro l = new Loro(true, 5, "Poli", "Durazno", "no");
        l.hacerTruco();
        System.out.println("Todo: ");
        System.out.println(l);
        l.setNombre("Tina");
        l.setComidaFavorita("Pera");
        l.setCanHuevosMaximos(6);
        l.setEsImitador(false);
        l.setEsExotica("Si");
        System.out.println("Lorito:  \n" + l);
        
        System.out.println(l.getNombre()+ ";" + l.getComidaFavorita()+ "," + l.getCanHuevosMaximos()+ ";" + l.getEsImitador()+ ";"+ l.getEsExotica()+ "." );
        
    }
}
