package temas.t8_clasesAbstractas;

public class TrabajandoConTriangulo {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(3.4, 2.8, 7.2);
        
        double perimetro = t.calcularPerimetro();
        System.out.println("Perimetro: " + perimetro);
        
        double superficie = t.calcularSuperficie();
        System.out.println("Superficie: " + superficie);
        
        System.out.println("Superficie sv: " + t.calcularSuperficie());
        System.out.println("Perimetro sv: " + t.calcularPerimetro());
    }
}
