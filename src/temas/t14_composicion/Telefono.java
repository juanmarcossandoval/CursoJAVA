package temas.t14_composicion;

public class Telefono {
    private TipoTelefono tipo;
    private String numero;

    public Telefono() {
    }

    public Telefono(TipoTelefono tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public TipoTelefono getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefono tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" + "\n" +
                "tipo:" + tipo + ",\n" +
                "numero:" + numero + "\n" +
                '}';
    }
        
}
