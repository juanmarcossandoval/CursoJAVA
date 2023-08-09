package temas.t8_clasesAbstractas;

public class Gato extends Mascota{
    
    private int cantBigotes;
    private boolean pelajeLargo;
    private int cantColores;

    public Gato(int cantBigotes, boolean pelajeLargo, int cantColores, String nombre, String comidaFavorita, String esExotica) {
        super(nombre, comidaFavorita, esExotica);
        this.cantBigotes = cantBigotes;
        this.pelajeLargo = pelajeLargo;
        this.cantColores = cantColores;
    }

    public int getCantBigotes() {
        return cantBigotes;
    }

    public void setCantBigotes(int cantBigotes) {
        this.cantBigotes = cantBigotes;
    }

    public boolean esPelajeLargo() {
        return pelajeLargo;
    }

    public void setPelajeLargo(boolean pelajeLargo) {
        this.pelajeLargo = pelajeLargo;
    }

    public int getCantColores() {
        return cantColores;
    }

    public void setCantColores(int cantColores) {
        this.cantColores = cantColores;
    }

    @Override
    public String toString() {
        return '{' 
                + "nombre:" + super.getNombre() + ",\n"
                + "comidaFavorita:" + super.getComidaFavorita()+ ",\n"
                + "esExotica:" + super.getEsExotica()+ ",\n"
                + "cantBigotes:" + cantBigotes + ",\n"
                + "pelajeLargo:" + pelajeLargo + ",\n"
                + "cantColores:" + cantColores + '}';
    }
    
    @Override
    public void hacerTruco() {
        System.out.println("El gato tira la taza de la mesa");
    }

    @Override
    public void moverse() {
        System.out.println("El gato trepa");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }
   
}
