package temas.t14_composicion;

//probando git
public class Contacto {
    private Persona persona;
    private Telefono telefono;
    private Domicilio domicilio;

    public Contacto() {
    }

    public Contacto(Persona persona, Telefono telefono, Domicilio domicilio) {
        this.persona = persona;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Contacto{" + "persona=" + persona + ", telefono=" + telefono + ", domicilio=" + domicilio + '}';
    }
    
}
