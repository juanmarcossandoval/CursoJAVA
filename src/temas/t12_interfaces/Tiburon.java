package temas.t12_interfaces;

public class Tiburon implements AnimalAcuatico {

    @Override
    public void nadar() {
        System.out.println("El tiburon esta nadando...");
    }

    @Override
    public void bucear() {
        System.out.println("El tiburon esta buceando...");
    }
    
}
