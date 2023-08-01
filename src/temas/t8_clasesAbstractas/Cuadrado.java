package temas.t8_clasesAbstractas;

public class Cuadrado extends Figura{
    private double lado;
    
    public Cuadrado(double lado, int cantidadLados){
        super(cantidadLados);
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
