package temas.t9_ComprendiendoStatic;

public class Ticket {
    
    private static int ticketsVendidos;
    
    private int num_ticket;
    private String pelicula;

    public Ticket(String pelicula) {
        this.pelicula = pelicula;
        Ticket.ticketsVendidos ++;
        this.num_ticket = ticketsVendidos;
    }

    public int getNum_ticket() {
        return num_ticket;
    }

    public void setNum_ticket(int num_ticket) {
        this.num_ticket = num_ticket;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    
    public static int getTicketsVendidos() {
        return ticketsVendidos;
    }

    public static void setTicketsVendidos(int aTicketsVendidos) {
        ticketsVendidos = aTicketsVendidos;
    }
    
    @Override
    public String toString() {
        return "Ticket{" + "num_ticket=" + num_ticket + ", pelicula=" + pelicula + '}';
    }
    
}
