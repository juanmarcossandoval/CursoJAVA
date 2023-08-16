package temas.t8_clasesAbstractas;

public class Loro extends Mascota {

    private boolean esImitador;
    private int canHuevosMaximos;

    public Loro(boolean esImitador, int canHuevosMaximos, String nombre, String comidaFavorita, String esExotica) {
        super(nombre, comidaFavorita, esExotica);
        this.esImitador = esImitador;
        this.canHuevosMaximos = canHuevosMaximos;
    }

    public boolean esImitador() {
        return esImitador;
    }

    public boolean getEsImitador() {
        return esImitador;
    }

    public void setEsImitador(boolean esImitador) {
        this.esImitador = esImitador;
    }

    public int getCanHuevosMaximos() {
        return canHuevosMaximos;
    }

    public void setCanHuevosMaximos(int canHuevosMaximos) {
        this.canHuevosMaximos = canHuevosMaximos;
    }

    @Override
    public String toString() {
        return "{\n"
                + "nombre:" + super.getNombre() + ",\n"
                + "comidaFavorita:" + super.getComidaFavorita() + ",\n"
                + "esExotica:" + super.getEsExotica() + ",\n"
                + "es imitador:" + esImitador + ",\n"
                + "Cantidad de Huevos:" + canHuevosMaximos + ",\n}";
    }

    @Override
    public void hacerTruco() {
        if (this.esImitador) {
            System.out.println("Imita");
        } else {
            System.out.println("Mueve La Cabeza");
        }
    }

    @Override
    public void moverse() {
        System.out.println("Este Loro Puede Volar");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Este Loro Puede Garrear");
    }

    public void volar() {
        System.out.println("Loro Volador");
    }
}
