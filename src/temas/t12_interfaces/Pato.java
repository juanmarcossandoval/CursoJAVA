package temas.t12_interfaces;

public class Pato implements AnimalAcuatico, AnimalAereo, AnimalTerreste{

    @Override
    public void nadar() {
        System.out.println("El pato esta nadando..."); 
    }

    @Override
    public void bucear() {
        System.out.println("El pato esta bucenado...");
    }

    @Override
    public void volar() {
        System.out.println("El pato esta volando...");
    }

    @Override
    public void planear() {
        System.out.println("El pato esta planeando...");
    }

    @Override
    public void correr() {
        System.out.println("El pato esta coprriendo...");
    }

    @Override
    public void caminar() {
        System.out.println("El pato esta caminando...");
    }
    
}
