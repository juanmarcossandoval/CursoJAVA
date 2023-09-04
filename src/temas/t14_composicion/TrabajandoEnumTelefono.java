package temas.t14_composicion;

public class TrabajandoEnumTelefono {
    public static void main(String[] args) {
        TipoTelefono tt = TipoTelefono.TRABAJO;
        System.out.println(tt);
        Dias d = Dias.LUNES;
        System.out.println(d);
        System.out.println(Dias.MARTES);
        
        TipoTelefono opciones[] = TipoTelefono.values();
        for( int i = 0 ; i < opciones.length; i++){
            System.out.println(opciones[i]);
            
        }
        
        System.out.println("ordinal de lunes: "+ Dias.LUNES.ordinal());
        
    }
 
}
