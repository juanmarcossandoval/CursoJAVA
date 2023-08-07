
package temas.t8_clasesAbstractas;


public class TrabajandoConRombo {
    public static void main(String[] args) {
        Rombo a = new Rombo(10,16,12);
        
        double superficie = a.calcularSuperficie();
        System.out.println("superficie: " + superficie);
        
        double perimetro = a.calcularPerimetro();
        System.out.println("perimetro: " + perimetro);
    }
    
}
