
package temas.t3_sentenciasDeControl;

public class Bifurcaciones {
    public static void main(String[] args) {
        //========== continue ==========
        System.out.println("Ejemplo continue For");
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0){ //si es par o multiplo de 2
                //Dada la condicion del if la palabra reservada continue
                //hara que el for concluya el ciclo y continue al siguente paso
                //ignorando todo el codigo que le procede
                continue;
            }
            System.out.println("Repeticion numero: " + i);
        }
        //========== otro ejemplo ==========
        System.out.println("Ejemplo continue While");
        int vuelta = 0;
        while (vuelta < 10) {
            vuelta++;
            if (vuelta >= 5){ 
                // si el numero es mayor o igual a 5 ya no se imprimira
                continue;
            }
            System.out.println("Numero: " + vuelta);
        }
        System.out.println("Cantidad de repeticiones: " + vuelta);
        
        //========== BREAK ==========
        System.out.println("Ejemplo break While");
        vuelta = 10;
        while (vuelta > 0) {
            vuelta--;
            if (vuelta == 5){ 
                // si el numero es igual a 5 el bucle se rompe
                // sin importar si la condicion del while se cumple o no
                // el bucle se da por terminado con la palabra reservada break
                break;
            }
            System.out.println("Numero: " + vuelta);
        }
        System.out.println("Cantidad de repeticiones: " + vuelta);
    }
}
