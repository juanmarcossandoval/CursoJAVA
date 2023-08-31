package temas.t13_enumerados.enumeradosConAtributos;

public class TrabajandoConMeses {
    public static void main(String[] args) {
        EnumMeses em = EnumMeses.ENERO;
        System.out.println("Abreviatura de ENERO: " + em.getAbrMes());
        System.out.println("COMPLETO MARZO: " + EnumMeses.MARZO);
        System.out.println("Abreviatura de MARZO: " + EnumMeses.MARZO.getAbrMes());
        System.out.println("Num de mes de MARZO: " + EnumMeses.MARZO.getNumMes());
        
        EnumMeses arregloMeses[] = EnumMeses.values();
        
        System.out.println("TODOS LOS MESES LISTADOS");
        for (int i = 0; i < arregloMeses.length; i++){
            System.out.println(arregloMeses[i]);
            System.out.println("Catindad de dias del mes: " + arregloMeses[i].cantidadDias());
            System.out.println("");
        }
        
        
    }
}
