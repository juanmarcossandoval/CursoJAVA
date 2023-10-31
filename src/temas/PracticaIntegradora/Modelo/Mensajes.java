package temas.PracticaIntegradora.Modelo;

public enum Mensajes {
    NUMERO("Ingrese un numero de telefono: "),
    EXIST("Ya existe un contacto con ese numero..."),
    NOMBRE("Ingrese un nombre: "),
    APELLIDO("Ingrese un apellido: "),
    NACIMIENTO("Ingrese fecha de nacimiento: "),
    EMAIL ("Ingrese un email: "),
    NOMOAPE ("Ingrese un nombre o apellido: "),
    INVALID_OPTION ("Elijio una opcion invalida... "),
    NOT_FOUND ("No se encontro un contacto con los datos solicitados..."),
    SELECT_CONTACT("Por favor ingrese el numero de contacto a selecionar..."),
    EMPTY_CONTACTS("No hay contactos agendados para mostrar...");
    
    private String msg;

    private Mensajes(String msg) {
        this.msg = msg;
    }

    public String msg(){
        return this.msg;
    }
    
}
