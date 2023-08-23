package temas.t12_interfaces;

public class Celular implements Mensajero {

    @Override
    public void enviarMensaje(String msg) {
        System.out.println(msg);
    }
    
}
