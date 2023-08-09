package temas.t8_clasesAbstractas;

public class Tortuga extends Mascota {

    private boolean esDeRio;
    private boolean estaHibernando;
    private boolean estaEnAgua;

    public Tortuga(boolean esDeRio, boolean estaHibernando, boolean estaEnAgua, String nombre, String comidaFavorita, String esExotica) {
        super(nombre, comidaFavorita, esExotica);
        this.esDeRio = esDeRio;
        this.estaHibernando = estaHibernando;
        this.estaEnAgua = estaEnAgua;
    }

    public boolean isEsDeRio() {
        return esDeRio;
    }

    public void setEsDeRio(boolean esDeRio) {
        this.esDeRio = esDeRio;
    }

    public boolean isEstaHibernando() {
        return estaHibernando;
    }

    public void setEstaHibernando(boolean estaHibernando) {
        this.estaHibernando = estaHibernando;
    }

    public boolean isEstaEnAgua() {
        return estaEnAgua;
    }

    public void setEstaEnAgua(boolean estaEnAgua) {
        this.estaEnAgua = estaEnAgua;
    }


    @Override
    public void moverse() {
        if (this.estaEnAgua) {
            System.out.println("la tortuga esta nadando");
        } else {
            System.out.println("la tortuga empieza a caminar");
        }
    }

    @Override
    public void hacerSonido() {
        System.out.println("La Tortuga esta Chillando");
    }

    @Override
    public void hacerTruco() {
        System.out.println("La Tortuga esconde la cabeza");
    }

    public void hibernarOdespertarse(){
        if (this.estaHibernando){
            this.estaHibernando = false;
            System.out.println("la tortuga se despierta");
        }else{
            this.estaHibernando = true;
            System.out.println("la tortuga empezo a hibernar");
        }
    }
}
