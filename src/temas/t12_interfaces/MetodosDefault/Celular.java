package temas.t12_interfaces.MetodosDefault;

public class Celular implements Mensajero{
    
    @Override
    public void enviarMensaje(String msg){
        System.out.println("Este es el mensaje de celular sobreescrito");
    }
}
