package temas.t16_BigNumbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class TrabajandoConBigDecimal {
    
    public static void main(String[] args) {
        //problema de precision de los double
        BigDecimal bd = new BigDecimal(8.9);
        System.out.println("BigDecimal con double: " + bd);
        
        bd = new BigDecimal(9);
        System.out.println("BigDecimal con integer: " + bd);
        
        bd = new BigDecimal("8.9");
        System.out.println("BigDecimal con String: " + bd);
        //bd = new BigDecimal();
        
        BigDecimal a = new BigDecimal("1.2");
        
        BigDecimal b = new BigDecimal("1.3");
        
        //sumar bd
        BigDecimal resultado = a.add(b);
        System.out.println("RESULTADO SUMA: " + resultado);
        
        //multiplicar bd
        resultado = a.multiply(b);
        System.out.println("RESULTADO MULTIPLICACION: " + resultado);
        
        //restar bd
        resultado = a.subtract(b);
        System.out.println("RESULTADO RESTA: " + resultado);
        
        //division de BIGDECIMAL
        BigDecimal c = new BigDecimal("10");
        BigDecimal d = new BigDecimal("3");
        
        //esto nos tira una excepcion porque al dar un resultado con decimales periodicos se desborda la memoria
        //resultado = c.divide(d);
        
        //DEFINIMOS LAS REGLAS DE NEGOCIO
        final MathContext $MATH_CONTEXT = new MathContext(3,RoundingMode.HALF_UP);
        
        resultado = c.divide(d,$MATH_CONTEXT);
        System.out.println("RESULTADO DIVISION: " + resultado);
        
        //potencia de un bd
        resultado = c.pow(2);
        System.out.println("RESULTADO POTENCIA: " + resultado);
        
        //raiz de un bd
        // es solamente la raiz cuadrada y se le pasa por parametro un contexto matematico que define la cantidad
        // de decimales que deseen mostrar
        resultado = resultado.sqrt(new MathContext(2));
        System.out.println("Resultado de la raiz cuadrada: " + resultado);
        
        //resultado va a ser igual a un 5 raiz cuadrada con 2 decimales
        resultado = new BigDecimal("5").sqrt(new MathContext(5));
        System.out.println("Resultado de la seg raiz cuadrada: " + resultado);
        
        // Como cambiar la cantidad de decimales de un bd
        BigDecimal y = new BigDecimal ("2.34566");
        BigDecimal z = y.setScale(3, RoundingMode.HALF_EVEN);
        System.out.println("ReEscalado del BD: " + z);
        
        BigDecimal mayor = new BigDecimal("5.22");
        BigDecimal menor = new BigDecimal("3.1");
        BigDecimal igual = new BigDecimal("5.22");
        
        int comparacion = mayor.compareTo(menor);
        System.out.println("comparacion: " + comparacion);
        
        comparacion = menor.compareTo(mayor);
        System.out.println("comparacion: " + comparacion);
        
        comparacion = mayor.compareTo(igual);
        System.out.println("comparacion: " + comparacion);
        
        if (mayor.compareTo(menor) == 1){
            System.out.println("El primer numero es el mayor");
        } else if (mayor.compareTo(menor) == -1) {
            System.out.println("El primer numero es el menor");
        } else {
            System.out.println("Los numeros son iguales");
        }
        
        if (mayor.compareTo(igual) == 0){
            System.out.println("Los numeros son iguales");
        }
        
        resultado = a.subtract(b).multiply(c).divide(d,new MathContext(2));
        
        resultado = (a.subtract(b)).subtract((a.multiply(b)));
        
        BigDecimal absoluto = new BigDecimal("-1.34");
        resultado = absoluto.abs();
        System.out.println("Valor absoluto de resultado: " + resultado);
    }
}
