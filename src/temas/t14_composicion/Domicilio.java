package temas.t14_composicion;

public class Domicilio {
    private String calle;
    private String altura;
    private String codPos;
    private String ciudad;
    
    public Domicilio(){
    }

    public Domicilio(String calle, String altura, String codPos, String ciudad) {
        this.calle = calle;
        this.altura = altura;
        this.codPos = codPos;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getCodPos() {
        return codPos;
    }

    public void setCodPos(String codPos) {
        this.codPos = codPos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle:" + calle + ", altura:" + altura + ", codPos:" + codPos + ", ciudad:" + ciudad + '}';
    }
    
    
}
