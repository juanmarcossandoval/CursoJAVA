package temas.t16_BigNumbers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import temas.t10_TryCatch.ConsoleUtils;

public class PracticaBigDecimal {

    /*
      programa con menu con las sig opciones:
	sumar, restar, dividir, multiplicar, potencia, raiz cuadrada	
        redondear un numero a x decimales
        1 modulo por opcion
        1 modulo para el menu
     */
    private static final String MSG = "Ingrese un numero decimal: ";
    private static final String RES = "El resultado es : ";
    private static final String ERR = "No se ingreso un dato númerico";

    public static void main(String[] args) {
        seleccionarOpcion(pintarMenu());
    }

    private static Integer pintarMenu() {
        ConsoleUtils.imprimir("Seleccionar una opcion: ");
        ConsoleUtils.imprimir("1) Sumar");
        ConsoleUtils.imprimir("2) Restar");
        ConsoleUtils.imprimir("3) Multiplicar");
        ConsoleUtils.imprimir("4) Dividir");
        ConsoleUtils.imprimir("5) Raiz Cuadrada");
        ConsoleUtils.imprimir("6) Potenciar");
        ConsoleUtils.imprimir("7) Redondear");
        ConsoleUtils.imprimir("8) Valor Absoluto");
        return ConsoleUtils.leerEntero();
    }

    private static void seleccionarOpcion(Integer opcion) {
        switch (opcion) {
            case 1:
                sumar();
                break;
            case 2:
                restar();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            case 5:
                raizCuadrada();
                break;
            case 6:
                potenciar();
                break;
            case 7:
                redondear();
                break;
            case 8:
                valorAbs();
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }

    private static void sumar() {
        BigDecimal numA = ConsoleUtils.leerBigDecimal(MSG);
        if (numA == null){
            ConsoleUtils.imprimir(ERR);
            return;
        }
        BigDecimal numB = ConsoleUtils.leerBigDecimal(MSG);
        if (numB == null) {
            ConsoleUtils.imprimir(ERR);
            return;
        }
        BigDecimal resultado = numA.add(numB);
        System.out.println(RES + resultado);
    }

    private static void restar() {
        BigDecimal numeroA = ConsoleUtils.leerBigDecimal(MSG);
        if (numeroA == null){
           ConsoleUtils.imprimir(ERR);
           return;   
        }
        BigDecimal numeroB = ConsoleUtils.leerBigDecimal(MSG);
        if (numeroB == null){
            ConsoleUtils.imprimir(ERR);
            return;
        }
        BigDecimal resultado = numeroA.subtract(numeroB);
        System.out.println(RES + resultado);
    }

    private static void dividir() {

    }

    private static void multiplicar() {
        BigDecimal numA = ConsoleUtils.leerBigDecimal(MSG);
        if (numA == null) {
            ConsoleUtils.imprimir(ERR);
            return;
        }
        BigDecimal numB = ConsoleUtils.leerBigDecimal(MSG);
        if (numB == null){
            ConsoleUtils.imprimir(ERR);
            return;
        }
        BigDecimal resultado = numA.multiply(numB);
        System.out.println(RES + resultado);
        
    }

    private static void potenciar() {

    }

    private static void raizCuadrada() {

    }

    private static void redondear() {
        BigDecimal numLeido = ConsoleUtils.leerBigDecimal(MSG);
        if (numLeido== null) {
            ConsoleUtils.imprimir(ERR);
            return;
        }
        Integer cantDecimales = ConsoleUtils.leerEntero("Ingrese la cantidad de decimales que desea:");
        if (cantDecimales == null){
            ConsoleUtils.imprimir(ERR);
            return;
        }
        BigDecimal numRedondeado = numLeido.setScale(cantDecimales,RoundingMode.HALF_UP);
        System.out.println(RES + numRedondeado);
    }
    
    private static void valorAbs() {
        
    }
}
