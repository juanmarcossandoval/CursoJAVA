package temas.PracticaIntegradora.Modelo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Contacto {
    
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private TipoTelefono tipoTelefono;
    private String numero;
    private String email;
    
}
