package temas.PracticaIntegradora.Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import temas.PracticaIntegradora.Controlador.ContactoManager;
import temas.PracticaIntegradora.Utils.ConsolaUtils;

public class Agenda implements ContactoManager{
    //notacion diamante <>
    List<Contacto> contactos;
    
    private static final String NUMERO = "Ingrese un numero de telefono: ";
    private static final String EXIST = "Ya existe un contacto con ese numero...";
    private static final String NOMBRE = "Ingrese un nombre: ";
    private static final String APELLIDO = "Ingrese un apellido: ";
    private static final String NACIMIENTO = "Ingrese fecha de nacimiento: ";
    private static final String EMAIL = "Ingrese un email: ";

    public Agenda() {
        this.contactos = new ArrayList<>();
    }
    
    @Override
    public Contacto crearNuevo() {
        Contacto aux = new Contacto();
        aux.setNumero(ConsolaUtils.leerCadena(NUMERO));
        if (buscarPorNumero(aux.getNumero())!= null){
            ConsolaUtils.imprimir(EXIST);
            return null;
        }
        aux.setNombre(ConsolaUtils.leerCadena(NOMBRE).toUpperCase());
        aux.setApellido(ConsolaUtils.leerCadena(APELLIDO).toUpperCase());
        aux.setFechaNacimiento(ConsolaUtils.leerFecha(NACIMIENTO));
        aux.setTipoTelefono(ConsolaUtils.leerTipoTelefono());
        aux.setEmail(ConsolaUtils.leerCadena(EMAIL).toUpperCase(Locale.ITALY));
        return aux;
    }

    @Override
    public void eliminar(Contacto c) {
        this.contactos.remove(c);
    }

    @Override
    public Contacto buscarPorNumero(String numero) {
        for (Contacto c: contactos){
            if (c.getNumero().equals(numero)){
                return c;
            }
        }
        return null;
    }

    @Override
    public Contacto buscarPorEmail(String email) {
        for (Contacto c : contactos){
            if (c.getEmail().equals(email)){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Contacto> buscarPorNombreOApellido(String nomOApe) {
        String criterio = nomOApe.toUpperCase();
        List<Contacto> encontrados = new ArrayList<>();
        
        for (Contacto c : contactos){
            if (c.getNombre().equals(criterio)){
                encontrados.add(c);
            } else if (c.getApellido().equals(criterio)){
                encontrados.add(c);
            }
        }
        return encontrados;
    }

    @Override
    public void listarTodos() {
        for (int i = 0; i < this.contactos.size(); i++){
            //consigue el contacto en la posicion i y lo convierte a string para imprimirlo
            ConsolaUtils.imprimir(i + ")" + contactos.get(i).toString());
        }
    }

    @Override
    public Contacto modificar() {
        return null;
    }
}
