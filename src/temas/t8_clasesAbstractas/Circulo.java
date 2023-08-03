
package temas.t8_clasesAbstractas;

public class Circulo extends Figura {
    private double radio;
    private double pi = 3.1416;
    private double perimetroCirculo = (2*pi)*radio;
    
    public Circulo(double radio) {
        super(0);
        this.radio = radio;
    }
    
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetroCirculo() {
        return perimetroCirculo;
    }

    public void setPerimetroCirculo(double perimetroCirculo) {
        this.perimetroCirculo = perimetroCirculo;
    }

    
    @Override
    public double calcularSuperficie() {
       return pi* (radio * radio);
    }

    @Override
    public double calcularPerimetro() {
       return perimetroCirculo;
    }
}
