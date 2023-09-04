
package temas.t14_composicion;

public enum Dias {
    LUNES("LUN",1),
    MARTES("MAR",2),
    MIERCOLES("MIER",3);
    
    private String abreviatura;
    private int diaSemana;

    private Dias(String abreviatura, int diaSemana) {
        this.abreviatura = abreviatura;
        this.diaSemana = diaSemana;
    }

    @Override
    public String toString() {
        return this.name() + "{" + "abreviatura=" + abreviatura + ", diaSemana=" + diaSemana + '}';
    }
      
    
}
