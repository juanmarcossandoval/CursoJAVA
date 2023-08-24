package temas.t9_ComprendiendoStatic;

public class ComprendiendoStatic {
    
    public static void main(String[] args) {
        Auto.metodoEstatico();
        Auto a = new Auto();
        System.out.println("km recorridosA: " + a.getKmRecorridos());
        a.recorrerKm(10);
        System.out.println("km recorridosA: " + a.getKmRecorridos());
        a.metodoDeObjeto();
        a.llamarMetodoEstatico();
        System.out.println("numero de auto: " + Auto.getNumeroDeAuto());
        
        Auto b = new Auto();
        b.recorrerKm(100);
        System.out.println("km recorridosB: " + b.getKmRecorridos());
        b.metodoDeObjeto();
        b.llamarMetodoEstatico();
        System.out.println("numero de auto: " + Auto.getNumeroDeAuto());
    }
}
