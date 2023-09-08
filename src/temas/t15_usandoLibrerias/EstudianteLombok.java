package temas.t15_usandoLibrerias;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper=false)
public class EstudianteLombok extends PersonaLombok{
    
    private int yearCursada;

    public EstudianteLombok(int yearCursada, String nombre, String apellido, String profesion) {
        super(nombre, apellido, profesion);
        this.yearCursada = yearCursada;
    }
    
}
