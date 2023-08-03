package temas.t8_clasesAbstractas;


public class Triangulo extends Figura{
    
    private double ladoA;
    private double ladoB;
    private double hipotenusa;

    public Triangulo(double ladoA,double ladoB, double hipotenusa) {
        super(3);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.hipotenusa = hipotenusa;
    }
    
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    
    @Override
    public double calcularSuperficie() {
        return (ladoA * ladoB)/ 2;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + hipotenusa;
    }

}
