package temas.t18_trabajandoFechas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TemaFechas {
    public static void main(String[] args) {
        Date pasado = new Date();
        System.out.println("pasado = " + pasado);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(sdf.format(pasado));
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf2.format(pasado));
        
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd 'de' MM 'del año' yyyy");
        System.out.println(sdf3.format(pasado));
        
        Date deprecada = new Date(2023,12,23);
        System.out.println("deprecada = " + deprecada);
        
        LocalDate ahora = LocalDate.now();
        System.out.println("ahora = " + ahora);
        System.out.println(ahora.format(DateTimeFormatter.ISO_DATE));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(ahora.format(dtf));
        
        LocalDate fechaPersonalizada = LocalDate.of(2023, 9, 30);
        System.out.println(fechaPersonalizada.format(dtf));
        
        System.out.println("año de la fecha pasado: "+ pasado.getYear());
        
        LocalDate nuevaFecha = LocalDate.of(pasado.getYear()+1900, 
                pasado.getMonth()+1, 
                pasado.getDay()+10);
        System.out.println("LocalDate a partir de Date: " + nuevaFecha);
    }
}
