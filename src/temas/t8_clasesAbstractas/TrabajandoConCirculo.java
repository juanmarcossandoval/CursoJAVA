package temas.t8_clasesAbstractas;

public class TrabajandoConCirculo {
    
    public static void main(String[] args) {
        Circulo c = new Circulo(3.43);
        
        double superficie = c.calcularSuperficie();     
        System.out.println("valor de superfice: " + superficie);
        
        double perimetro = c.calcularPerimetro();
        System.out.println("Perimetro: " + perimetro);
        
        System.out.println("Superficie sv: " + c.calcularSuperficie());
        System.out.println("Perimetro sv: " + c.calcularPerimetro());
    }
    
}
