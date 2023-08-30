package temas.t13_enumerados;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String tipoIdentificacion;
    private String numIdentificacion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String tipoIdentificacion, String numIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numIdentificacion = numIdentificacion;
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

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    @Override
    public String toString() {
        return "{" + ",\n" +
                "nombre:" + nombre + ",\n" +
                "apellido:" + apellido +  ",\n" +
                "tipoIdentificacion:" + tipoIdentificacion + ",\n" +
                "numIdentificacion:" + numIdentificacion + ",\n" + 
                '}';
    }
    
    
}
