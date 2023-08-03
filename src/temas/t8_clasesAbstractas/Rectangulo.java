
package temas.t8_clasesAbstractas;

public class Rectangulo extends Figura {

    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto){
        super(4);
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
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
