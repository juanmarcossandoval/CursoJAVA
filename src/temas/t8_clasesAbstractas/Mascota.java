
package temas.t8_clasesAbstractas;

public abstract class Mascota {
    private String nombre;
    private String comidaFavorita;
    private String esExotica;

    public Mascota(String nombre, String comidaFavorita, String esExotica) {
        this.nombre = nombre;
        this.comidaFavorita = comidaFavorita;
        this.esExotica = esExotica;
    }

    public String getEsExotica() {
        return esExotica;
    }

    public void setEsExotica(String esExotica) {
        this.esExotica = esExotica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }
    
    public abstract void hacerTruco();
    public abstract void moverse();
    public abstract void hacerSonido();
}
