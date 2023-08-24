package temas.t9_ComprendiendoStatic;

import temas.t10_TryCatch.ConsoleUtils;

public class VentaTickets {
    
    public static void main(String[] args) {
        
        Ticket t1 = new Ticket("Barbie");
        System.out.println(t1);//num = 1
        
        Ticket t2 = new Ticket("TRANSFORMERS");
        System.out.println(t2);//num = 2
        
        Ticket t3 = new Ticket("Dragon ball");
        System.out.println(t3);//num = 3
        
        Ticket t4 = new Ticket("Openheimer");
        System.out.println(t4);//num = 4   
        
        System.out.println(t1.getNum_ticket());
        System.out.println(t2.getNum_ticket());
        
        System.out.println(Ticket.getTicketsVendidos());
    }   
}
