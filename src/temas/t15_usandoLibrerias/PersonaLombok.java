package temas.t15_usandoLibrerias;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PersonaLombok {
    
    private String nombre;
    private String apellido;
    private String profesion;
    
    public void presentarse(){
        System.out.println("Hola soy " + this.getNombre());
    }
    
}
