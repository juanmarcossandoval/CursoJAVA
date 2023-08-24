package temas.t9_ComprendiendoStatic;

public class Auto {
    private int kmRecorridos;
    private static int numeroDeAuto;
    
    public Auto() {
        numeroDeAuto++;
    }
    
    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public static int getNumeroDeAuto() {
        return numeroDeAuto;
    }

    public static void setNumeroDeAuto(int numeroDeAuto) {
        Auto.numeroDeAuto = numeroDeAuto;
    }
    
    public void recorrerKm(int cantKm){
        this.kmRecorridos = this.kmRecorridos + cantKm;
    }
    
    public static void metodoEstatico(){
        System.out.println("este es un metodo estatico de clase");
    }
    
    public void metodoDeObjeto(){
        System.out.println("este es un metodo de objeto");
    }
    
    public void llamarMetodoEstatico(){
        metodoEstatico(); // los metodos de objetos si pueden llamar a los metodos staticos de la clase
    }
    
    public static void llamarMetodoDeObjeto(){
        //this.getKmRecorridos(); los metodos estaticos no pueden llamar a los metodos de objetos
    }

}
