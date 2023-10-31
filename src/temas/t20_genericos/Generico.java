package temas.t20_genericos;

public class Generico<Tipo>{
    
    private Tipo tipoObjeto;
    
    public Generico(Tipo tipoObjeto){
        this.tipoObjeto = tipoObjeto;
    }
    
    public void mostrarTipo(){
        System.out.println("este generico es de tipo: " 
                + this.tipoObjeto.getClass().getName()); 
    }
}
