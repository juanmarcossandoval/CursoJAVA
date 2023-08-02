package temas.t8_clasesAbstractas;

public abstract class Figura {
    
    private int cantidadLados;
    private double ladoA;
    private double ladoB;
    private double hipotenusa;
    
    public Figura(int cantidadLados){
        this.cantidadLados = cantidadLados;
    }
    
    public int getCantidadLados(){
        return this.cantidadLados;
    }
    
   public double getLadoA(){
        return this.ladoA;
   }
   
   public double setLadoA(){
       return this.ladoA;
   }
    
   public double getLadoB(){
        return this.ladoB;
   }
   
   public double setLadoB(){
       return this.ladoB;
   }
   
   public double getHipotenusa(){
        return this.hipotenusa;
   }
   
   public double sethipotenusa(){
       return this.hipotenusa;
   }
    public abstract double calcularSuperficie();
    public abstract double calcularPerimetro();
}
