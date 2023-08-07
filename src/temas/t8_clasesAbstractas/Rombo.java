
package temas.t8_clasesAbstractas;


public class Rombo extends Figura {
    private double lado;
    private double diagMa;
    private double diagMe;

    public Rombo(double lado, double diagMa, double diagMe) {
        super(4);
        this.lado = lado;
        this.diagMa = diagMa;
        this.diagMe = diagMe;
        
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getDiagMa() {
        return diagMa;
    }

    public void setDiagMa(double diagMa) {
        this.diagMa = diagMa;
    }

    public double getDiagMe() {
        return diagMe;
    }

    public void setDiagMe(double diagMe) {
        this.diagMe = diagMe;
    }

    
    @Override
    public double calcularSuperficie() {
        return (this.diagMa * this.diagMe) / 2; 
        
    }

    @Override
    public double calcularPerimetro() {
        return this.lado *4; 
    }
    
    
}
