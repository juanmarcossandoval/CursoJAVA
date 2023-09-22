package temas.PracticaIntegradora.Controlador;

import java.util.List;
import temas.PracticaIntegradora.Modelo.Contacto;

//CLASE CRUD -> CREATE, READ, UPDATE, DELETE
public interface ContactoManager {
    
    public void agregarNuevo();
    
    public Contacto crearNuevo();
    
    public void eliminar(Contacto c);
    
    public Contacto buscarPorNumero(String numero);
    
    public Contacto buscarPorEmail(String email);
    
    public List<Contacto> buscarPorNombreOApellido(String nomOApe);
    
    public void listarTodos();
    
    public Contacto modificar(Contacto c);
    
}
