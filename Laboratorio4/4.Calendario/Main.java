import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   
        String nome = "";
        Scanner newScanner = new Scanner(System.in);
        Calendario myCalendario = new Calendario();
        System.out.println(myCalendario.getCalendario().size());
        System.out.println("hello");
        System.out.println("inserisci nome evento");
        List <Evento> lista = myCalendario.getCalendario();
        while (newScanner.hasNext()) {
            nome = newScanner.next();
            System.out.println("inserisci data evento");
            String[] dArrOne = newScanner.next().split("/");
            int day = Integer.parseInt(dArrOne[0]);
            int month = Integer.parseInt(dArrOne[1]) - 1;
            int year = Integer.parseInt(dArrOne[2]) - 1900;
            Date myData = new Date(year, month, day);
            Evento event = new Evento(myData, nome);

            if (lista.size() >0) {
                for (Evento e : lista ) {
                    System.out.println("entrei");
                    System.out.println(e.date);
                    System.out.println(event.date);
                    if (e.date.equals(event.date) && e.name.equals(event.name)) {
                        System.out.println("elemento duplicado");
                    } else {
                        myCalendario.setCalendario(event);
                        System.out.println("created new event");
                        System.out.println(myCalendario.getCalendario().size());
                    }
                }
            }else {
                myCalendario.setCalendario(event);
            }
           
            System.out.println(myCalendario.getCalendario().size());
            System.out.println("inserisci nome evento");
            
        }

    }

}
