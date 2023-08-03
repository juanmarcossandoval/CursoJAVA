package temas.t8_clasesAbstractas;

public class TrabajandoConClasesAbstractas {
    
    public static void main(String[] args) {
       //Figura f1 = new Figura(); 
       //f1.getCantidadLados();
       
       Cuadrado c1 = new Cuadrado(3.0);
       c1.getCantidadLados();
       c1.calcularPerimetro();
       c1.calcularSuperficie();
       
       Rectangulo r1 = new Rectangulo(4.0,2.0);
       r1.getCantidadLados();
       r1.calcularPerimetro();
       r1.calcularSuperficie();
    }
}
