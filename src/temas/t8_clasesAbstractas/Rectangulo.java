
package temas.t8_clasesAbstractas;

public class Rectangulo extends Figura {

    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto, int cantidadLados){
        super(cantidadLados);
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public double calcularSuperficie() {
        return ancho * alto;
    }

    @Override
    public double calcularPerimetro() {
        return (ancho*2) + (alto*2);
    }
    
}
