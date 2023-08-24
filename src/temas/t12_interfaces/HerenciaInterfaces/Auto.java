package temas.t12_interfaces.HerenciaInterfaces;

public class Auto extends VehiculoElectrico{

    @Override
    public void arrancar() {
        System.out.println("El auto arranco");
    }

    @Override
    public void Encender() {
        System.out.println("El auto esta encendido");
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
