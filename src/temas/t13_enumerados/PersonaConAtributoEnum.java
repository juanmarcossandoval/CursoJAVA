
package temas.t13_enumerados;

public class PersonaConAtributoEnum {
    private String nombre;
    private String apellido;
    private TiposIdentificaciones tipoIdentificacion;//es un enum
    private String numIdentificacion;

    public PersonaConAtributoEnum() {
    }

    public PersonaConAtributoEnum(String nombre, String apellido, TiposIdentificaciones tipoIdentificacion, String numIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numIdentificacion = numIdentificacion;
    }
    
    @Override
    public String toString() {
        return "{" + ",\n" +
                "nombre:" + nombre + ",\n" +
                "apellido:" + apellido +  ",\n" +
                "tipoIdentificacion:" + tipoIdentificacion.toString() + ",\n" +
                "numIdentificacion:" + numIdentificacion + ",\n" + 
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TiposIdentificaciones getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TiposIdentificaciones tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }
}
