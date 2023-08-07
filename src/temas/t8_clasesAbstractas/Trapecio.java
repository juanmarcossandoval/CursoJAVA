package temas.t8_clasesAbstractas;

public class Trapecio extends Figura{
    
    private double lado1;
    private double lado2;
    private double baseChica;
    private double baseGrande;
    private double altura;
    
    public Trapecio(double baseChica,double baseGrande,double altura, double lado1, double lado2){
        super(4);     
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.baseChica = baseChica;
        this.baseGrande = baseGrande;
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    
    public double getBaseChica() {
        return baseChica;
    }

    public void setBaseChica(double baseChica) {
        this.baseChica = baseChica;
    }

    public double getBaseGrande() {
        return baseGrande;
    }

    public void setBaseGrande(double baseGrande) {
        this.baseGrande = baseGrande;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

   
    
    @Override
    public double calcularSuperficie() {
      return ((this.baseChica + this.baseGrande)/2)*this.altura;  
    }

    @Override
    public double calcularPerimetro() {
        return this.lado1+ this.lado2 + this.baseChica + this.baseGrande;
    }
    
    
    
    
}
