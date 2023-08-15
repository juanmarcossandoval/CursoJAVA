
package temas.t8_clasesAbstractas;

public class Serpiente extends Mascota {
    private boolean esVenenosa;
    private boolean tieneVeneno;
    private boolean estaEnTierra;

    public Serpiente(boolean esVenenosa, boolean tieneVeneno, boolean estaEnTierra, String nombre, String comidaFavorita, String esExotica) {
        super(nombre, comidaFavorita, esExotica);
        this.esVenenosa = esVenenosa;
        this.tieneVeneno = tieneVeneno;
        this.estaEnTierra = estaEnTierra;
    }

    public boolean esVenenosa() {
        return esVenenosa;
    }

    public void setEsVenenosa(boolean esVenenosa) {
        this.esVenenosa = esVenenosa;
    }

    public boolean tieneVeneno() {
        return tieneVeneno;
    }

    public void setTieneVeneno(boolean tieneVeneno) {
        this.tieneVeneno = tieneVeneno;
    }

    public boolean estaEnTierra() {
        return estaEnTierra;
    }

    public void setEstaEnTierra(boolean estaEnTierra) {
        this.estaEnTierra = estaEnTierra;
    }
    
    /*si es venenosa esta en true y tiene veneno en true, pasar tiene veneno a falso e imprimir "la serpiente pico" 
	si es venenosa esta en true y tiene veneno en false, pasar tiene veneno a true e imprimir "la serpiente mordio"
	si no es venenosa siempre debe imprimir "la serpiente mordio"*/
    
    public void MorderOPicar (){
        if (this.esVenenosa){
           if (this.tieneVeneno){
               System.out.println("la serpiente pica");
               this.tieneVeneno = false;
           }else{
               System.out.println("la serpiente muerde");
               this.tieneVeneno = true;
           } 
        }else{
            System.out.println("la serpiente mordio");
        } 
    }

    @Override
    public String toString() {
        return "{" + "esVenenosa:" + esVenenosa + ",\n"
                + " tieneVeneno:" + tieneVeneno + ",\n"
                + " estaEnTierra:" + estaEnTierra + ",\n"
                + " nombre: " + super.getNombre() + ",\n"
                + " comida favorita: " + super.getComidaFavorita() + ",\n"
                + " esExotica: " + super.getEsExotica() + ".\n" + "}";
    }

    
    @Override
    public void hacerTruco() {
        System.out.println("la serpiente no es divertida");
    }

    @Override
    public void moverse() {
        if (this.estaEnTierra){
            System.out.println("la serpiente empieza a reptar");
        }else{
            System.out.println("empieza a trepar un arbol");
        }
    }

    @Override
    public void hacerSonido() {
        System.out.println("la serpienta sisea");
    }
    
}
