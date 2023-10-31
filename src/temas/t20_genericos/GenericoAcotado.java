package temas.t20_genericos;

public class GenericoAcotado<E extends Number> {
    private E tipoObjeto;
    
    public GenericoAcotado(E tipoObjeto){
        this.tipoObjeto = tipoObjeto;
    }
    
    public void mostrarTipo(){
        System.out.println("Este generico es de tipo: " 
                + this.tipoObjeto.getClass().getName());
    }
}
