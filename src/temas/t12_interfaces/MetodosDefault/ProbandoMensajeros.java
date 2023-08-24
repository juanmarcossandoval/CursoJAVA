package temas.t12_interfaces.MetodosDefault;

public class ProbandoMensajeros {
    public static void main(String[] args) {
        
        Paloma p = new Paloma();
        Celular c = new Celular();
        
        p.enviarMensaje("Este es el mensaje de la paloma");
        c.enviarMensaje("Este es el mensaje del celular");
    }
 
}
