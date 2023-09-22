package temas.PracticaIntegradora.Modelo;

import java.time.LocalDate;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Contacto {
    
    private UUID id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private TipoTelefono tipoTelefono;
    private String numero;
    private String email;

    public Contacto() {
        this.id = UUID.randomUUID();
    }   
}
