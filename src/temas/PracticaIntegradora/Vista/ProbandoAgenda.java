package temas.PracticaIntegradora.Vista;

import java.util.ArrayList;
import java.util.List;
import temas.PracticaIntegradora.Modelo.Agenda;
import temas.PracticaIntegradora.Modelo.Contacto;
import temas.PracticaIntegradora.Modelo.Mensajes;
import temas.PracticaIntegradora.Utils.ConsolaUtils;

public class ProbandoAgenda {
    
    private static final Agenda agenda = new Agenda();
    
    public static void main(String[] args) {
        menuPrincipal();
    }
    
    public static void menuPrincipal(){
        Integer opcionElegida = -1;
        while (opcionElegida != 5){
            ConsolaUtils.imprimir("Elija una opcion: ");
            ConsolaUtils.imprimir("0) Crear agregar nuevo contacto ");
            ConsolaUtils.imprimir("1) Buscar por numero ");
            ConsolaUtils.imprimir("2) Buscar por email ");
            ConsolaUtils.imprimir("3) Buscar por nombre o apellido ");
            ConsolaUtils.imprimir("4) Listar todos ");
            ConsolaUtils.imprimir("5) Salir ");
            opcionElegida = ConsolaUtils.leerEntero();
            opcionesMenuPrincipal(opcionElegida);
        }
        System.exit(0);
    }
    
    public static void menuAcciones(Contacto c){
        System.out.println(c);
        System.out.println("================");
        ConsolaUtils.imprimir("Elija una opcion: ");
        ConsolaUtils.imprimir("0) Eliminar contacto ");
        ConsolaUtils.imprimir("1) Modificar contacto ");
        ConsolaUtils.imprimir("2) Volver al menu anterior ");
        Integer opcionElegida = ConsolaUtils.leerEntero();
    }
    
    public static void opcionesMenuPrincipal(Integer opcion){
        Contacto filtrado;
        List <Contacto> encontrados = new ArrayList();
        
        switch (opcion) {
            case 0:
                ProbandoAgenda.agenda.agregarNuevo();
                break;
            case 1: 
                filtrado = ProbandoAgenda.agenda.buscarPorNumero(
                    ConsolaUtils.leerCadena(Mensajes.NUMERO.msg()));
                break;
            case 2: 
                String emailBuscado = ConsolaUtils.leerCadena(Mensajes.EMAIL.msg());
                filtrado = ProbandoAgenda.agenda.buscarPorEmail(emailBuscado);
                break;
            case 3:
                String nomOape = ConsolaUtils.leerCadena(Mensajes.NOMOAPE.msg());
                encontrados = ProbandoAgenda.agenda.buscarPorNombreOApellido(nomOape);
                break;
            case 4: 
                ProbandoAgenda.agenda.listarTodos();
                break;
            default:
                ConsolaUtils.imprimir(Mensajes.INVALID_OPTION.msg());
                break;
        }
    }
    
}
