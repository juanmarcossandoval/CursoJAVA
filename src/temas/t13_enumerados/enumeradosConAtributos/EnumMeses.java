package temas.t13_enumerados.enumeradosConAtributos;

public enum EnumMeses {

    //public static final EnumMeses ENERO = new EnumMeses();
    ENERO("ENE",1), 
    FEBRERO("FEB",2),
    MARZO("MAR",3), 
    ABRIL("ABR",4),
    MAYO("MAY",5),
    JUNIO("JUN",6),
    JULIO("JUL",7),
    AGOSTO("AGO",8),
    SEPTIEMBRE("SEP",9),
    OCTUBRE("OCT",10),
    NOVIEMBRE("NOV",11),
    DICIEMBRE("DIC",12),;

    private String abrMes;
    private int numMes;

    private EnumMeses(String abrMes, int numMes) {
        this.abrMes = abrMes;
        this.numMes = numMes;
    }

    public String getAbrMes() {
        return abrMes;
    }

    public void setAbrMes(String abrMes) {
        this.abrMes = abrMes;
    }

    public int getNumMes() {
        return numMes;
    }

    public void setNumMes(int numMes) {
        this.numMes = numMes;
    }

    @Override
    public String toString() {
        return this.name() + "{" + "abrMes=" + abrMes + ", numMes=" + numMes + '}';
    }
    
    public int cantidadDias(){
        if (this.name().equals("NOVIEMBRE") ||
               this.name().equals("ABRIL") ||
                this.name().equals("SEPTIEMBRE") ||
                this.name().equals("JUNIO") ){
            return 30;
        } else if (this.name().equals("FEBRERO")){
            return 29;
        } 
        return 31;
    }

}
