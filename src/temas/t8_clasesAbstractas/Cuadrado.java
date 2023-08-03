package temas.t8_clasesAbstractas;

public class Cuadrado extends Figura{
    private double lado;
    
    public Cuadrado(double lado){
        super(4);
        this.lado = lado;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularSuperficie() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
    
}
