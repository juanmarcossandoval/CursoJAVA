package temas.t12_interfaces.HerenciaInterfaces;

public class Monopatin extends VehiculoElectrico {

    @Override
    public void arrancar() {
        System.out.println("El monopatin arranco");
    }

    @Override
    public void Encender() {
        System.out.println("El monopatin esta encendido");
    }

    @Override
    public void acelerar() {
        System.out.println("Esta acelerando");
    }

    @Override
    public void Cargar() {
        System.out.println("Esta cargando");
    }
    
}
