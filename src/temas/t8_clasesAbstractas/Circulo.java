
package temas.t8_clasesAbstractas;

public class Circulo extends Figura {
    
    private static final double PI = 3.1416;
    
    private double radio;    
    
    public Circulo(double radio) {
        super(0);
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public double getPI(){
        return this.PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularSuperficie() {
       return PI * (radio * radio);
    }

    @Override
    public double calcularPerimetro() {
       return (2*PI)*radio;
    }
}
