package temas.t8_clasesAbstractas;

public abstract class Figura {
    
    private int cantidadLados;
        
    public Figura(int cantidadLados){
        this.cantidadLados = cantidadLados;
    }
    
    public int getCantidadLados(){
        return this.cantidadLados;
    }
    
    public abstract double calcularSuperficie();
    public abstract double calcularPerimetro();
}
