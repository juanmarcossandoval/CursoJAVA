package temas.t8_clasesAbstractas;

public class TrabajandoConCirculo {
    
    public static void main(String[] args) {
        Circulo c = new Circulo(3.43);
        Circulo d = new Circulo(perimetroCirculo);
        double superficie = c.calcularSuperficie();     
        System.out.println("valor de superfice: " + superficie);
        double perimetro = d.calcularPerimetro();
    }
    
}
