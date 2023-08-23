package temas.t12_interfaces;

public class Paloma implements AnimalAereo, Mensajero{

    @Override
    public void volar() {
        System.out.println("La paloma esta volando...");
    }

    @Override
    public void planear() {
        System.out.println("La paloma esta planeando...");
    }

    @Override
    public void enviarMensaje(String msg) {
        System.out.println(msg);
    }
    
}
