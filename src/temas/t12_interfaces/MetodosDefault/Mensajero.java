package temas.t12_interfaces.MetodosDefault;

public interface Mensajero {
    
    default public void enviarMensaje(String msg){
        System.out.println(msg);
    };
}
