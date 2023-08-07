
package temas.t8_clasesAbstractas;

public class TrabajandoConTrapecio {
    public static void main(String[] args) {
        Trapecio t = new Trapecio (3.5, 7, 4.5, 2.5, 3);
        
        double perimetro = t.calcularPerimetro();
        System.out.println("Perimetro: " + perimetro);
        
        double superficie = t.calcularSuperficie();
        System.out.println("Superficie: " + superficie);
        
        
    }
    
}