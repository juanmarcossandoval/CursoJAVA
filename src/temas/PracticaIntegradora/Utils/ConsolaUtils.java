package temas.PracticaIntegradora.Utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import temas.PracticaIntegradora.Modelo.TipoTelefono;


public class ConsolaUtils {
    private static final String DIA = "Ingrese un dia: ";
    private static final String MES = "Ingrese un mes: ";
    private static final String ANIO = "Ingrese un año: ";
    private static final String ERR_DATE = "Datos invalidos para crear fecha";
    private static final String TIPO_TEL = "Ingrese un tipo telefono";
    private static final String ERR_TT = "Opcion incorrecta TipoTelefono";
    
    public static void main(String[] args) {
        String cadena = "juan";
        imprimir(cadena.toUpperCase());
    }
        
    public static void imprimir(String msg) {
        System.out.println(msg);
    }

    public static String leerCadena(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public static String leerCadena(String msg) {
        imprimir(msg);
        return leerCadena();
    }
    
    public static Integer leerEntero(){
        Scanner sc = new Scanner(System.in);
        try {
            Integer numeroLeido = sc.nextInt();
            return numeroLeido;
        } catch (InputMismatchException ex) {
            System.out.println("Ocurrio un error al leer el dato numerico");
            return null;
        }
    }
    
    public static Integer leerEntero(String msg) {
        imprimir(msg);
        return leerEntero();
    }
    
    public static LocalDate leerFecha(String msg) {
        Integer dia = leerEntero(DIA);
        Integer mes = leerEntero(MES);
        Integer anio = leerEntero(ANIO);
        if (dia == null || mes == null || anio == null){
            ConsolaUtils.imprimir(ERR_DATE);
        }
        LocalDate fecha = null;
        try{
            fecha = LocalDate.of(anio, mes, dia);
        } catch (DateTimeException ex) {
            ConsolaUtils.imprimir(ERR_DATE);
        }
        return fecha;
    }
    
    public static TipoTelefono leerTipoTelefono(){
        imprimir(TIPO_TEL);
        List<TipoTelefono> opciones = Arrays.asList(TipoTelefono.values());
        for (TipoTelefono tt : opciones){
            imprimir(tt.ordinal() + ")" + tt.name());
        }
        Integer opcionElegida = leerEntero();
        if (opcionElegida < 0 || opcionElegida > opciones.size()-1){
            imprimir(ERR_TT);
            return null;
        }
        return opciones.get(opcionElegida);
    }
    
}
