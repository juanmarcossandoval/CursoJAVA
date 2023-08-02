package temas.t8_clasesAbstractas;


public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double hipotenusa;

    public Triangulo(double ladoA,double ladoB, double hipotenusa) {
        super(3);
        this.ladoA = ladoA;
    }

    @Override
    public double calcularSuperficie() {
        return (ladoA * ladoB)/2;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + hipotenusa;
    }
}
