package temas.t8_clasesAbstractas;

public class Perro extends Mascota {

    private String raza;
    private String color;

    public Perro(String raza, String color, String nombre, String comidaFavorita, String esExotica) {
        super(nombre, comidaFavorita, esExotica);
        this.raza = raza;
        this.color = color;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", color=" + color + '}';
    }
    
    
    @Override
    public void hacerTruco() {
        System.out.println("da la patita");
    }

    @Override
    public void moverse() {
        System.out.println("el perro vuela");
    }

    @Override
    public void hacerSonido() {
        System.out.println("el perro ladra");
    }

    public void Rastrear(){
        System.out.println("el perro rastrea");
    } 
}
