package temas.PracticaIntegradora.Modelo;

import java.util.ArrayList;
import java.util.List;
import temas.PracticaIntegradora.Controlador.ContactoManager;
import temas.PracticaIntegradora.Utils.ConsolaUtils;

public class Agenda implements ContactoManager {

    //notacion diamante <>
    List<Contacto> contactos;  

    public Agenda() {
        this.contactos = new ArrayList<>();
    }
    
    @Override
    public void agregarNuevo(){
        Contacto contactoNuevo = crearNuevo();
        if(contactoNuevo != null){
            this.contactos.add(contactoNuevo);
        }        
    }

    @Override
    public Contacto crearNuevo() {
        Contacto aux = new Contacto();
        aux.setNumero(ConsolaUtils.leerCadena(Mensajes.NUMERO.msg()));
        if (buscarPorNumero(aux.getNumero()) != null) {
            ConsolaUtils.imprimir(Mensajes.EXIST.toString());
            return null;
        }
        aux.setNombre(ConsolaUtils.leerCadena(Mensajes.NOMBRE.msg()).toUpperCase());
        aux.setApellido(ConsolaUtils.leerCadena(Mensajes.APELLIDO.msg()).toUpperCase());
        aux.setFechaNacimiento(ConsolaUtils.leerFecha(Mensajes.NACIMIENTO.msg()));
        aux.setTipoTelefono(ConsolaUtils.leerTipoTelefono());
        aux.setEmail(ConsolaUtils.leerCadena(Mensajes.EMAIL.msg()).toUpperCase());
        return aux;
    }

    @Override
    public void eliminar(Contacto c) {
        this.contactos.remove(c);
    }

    @Override
    public Contacto buscarPorNumero(String numero) {
        for (Contacto c : contactos) {
            if (c.getNumero().equals(numero)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Contacto buscarPorEmail(String email) {
        String criterio = email.toUpperCase();
        for (Contacto c : contactos) {
            if (c.getEmail().equals(criterio)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Contacto> buscarPorNombreOApellido(String nomOApe) {
        String criterio = nomOApe.toUpperCase();
        List<Contacto> encontrados = new ArrayList<>();
        
        for (Contacto c : contactos) {
            //si el nombre por paramatro forma parte del nombre completo lo va a encontrar igual
            // por eso utilizamos el metodo "contains" de la clase STRING
            if (c.getNombre().contains(criterio)) {
                encontrados.add(c);
            } else if (c.getApellido().contains(criterio)) {
                encontrados.add(c);
            }
        }
        return encontrados;
    }

    @Override
    public void listarTodos() {
        if (this.contactos.isEmpty()){
            ConsolaUtils.imprimir(Mensajes.EMPTY_CONTACTS.msg());
        }
        for (int i = 0; i < this.contactos.size(); i++) {
            //consigue el contacto en la posicion i y lo convierte a string para imprimirlo
            ConsolaUtils.imprimir(i + ")" + contactos.get(i).toString());
        }
    }
    
    @Override
    public void listarTodos(List<Contacto> lista) {
        for (int i = 0; i < lista.size(); i++) {
            //consigue el contacto en la posicion i y lo convierte a string para imprimirlo
            ConsolaUtils.imprimir(i + ")" + contactos.get(i).toString());
        }
    }

    @Override
    public Contacto modificar(Contacto c) {
        String nuevoNumero = ConsolaUtils.leerCadena(Mensajes.NUMERO.msg());
        Contacto encontrado = buscarPorNumero(nuevoNumero);
        //si encuentra uno
        if (encontrado != null) {
            //nos aseguramos que el encontro sea el mismo que actualizamos
            if (encontrado.getId() != c.getId()) {
                ConsolaUtils.imprimir(Mensajes.EXIST.msg());
                return null;
            }
        }
        c.setNumero(nuevoNumero);
        c.setNombre(ConsolaUtils.leerCadena(Mensajes.NOMBRE.msg()).toUpperCase());
        c.setApellido(ConsolaUtils.leerCadena(Mensajes.APELLIDO.msg()).toUpperCase());
        c.setFechaNacimiento(ConsolaUtils.leerFecha(Mensajes.NACIMIENTO.msg()));
        c.setTipoTelefono(ConsolaUtils.leerTipoTelefono());
        c.setEmail(ConsolaUtils.leerCadena(Mensajes.EMAIL.msg()).toUpperCase());
        return c;
    }
}
