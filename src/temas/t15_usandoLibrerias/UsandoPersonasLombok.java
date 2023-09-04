package temas.t15_usandoLibrerias;

public class UsandoPersonasLombok {
    
    public static void main(String[] args) {
        PersonaLombok pl = new PersonaLombok("Juan Marcos", "Sandoval","carpitero");
        System.out.println("Persona: " + pl);
        
        pl.setApellido("sejuani");
        pl.setNombre("tomatito");
        pl.setProfesion("panadero");
        System.out.println(pl);
        
        EstudianteLombok el = new EstudianteLombok(2023, "fulanito", "sultanito","espartano");
        System.out.println(el);
        
    }
}
