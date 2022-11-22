import java.util.Scanner;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);

        // evento prima data
        System.out.println("inserisci data primo evento");
        String[] dArrOne = newScanner.next().split("/");
        int day1 = Integer.parseInt(dArrOne[0]);
        int month1 = Integer.parseInt(dArrOne[1]) - 1;
        int year1 = Integer.parseInt(dArrOne[2]) - 1900;
        Date firstDate = new Date(year1, month1, day1);

        // do un nome alla prima data
        System.out.println("inserisci nome primo evento");
        String name = newScanner.next();

        // creo primo evento
        Evento event1 = new Evento(firstDate, name);

        // creo seconda data
        System.out.println("inserisci data secondo evento");
        String[] dArrTwo = newScanner.next().split("/");
        int day2 = Integer.parseInt(dArrTwo[0]);
        int month2 = Integer.parseInt(dArrTwo[1]) - 1;
        int year2 = Integer.parseInt(dArrTwo[2]) - 1900;
        Date secondDate = new Date(year2, month2, day2);

        // do un nome alla secondo data
        System.out.println("inserisci nome secondo evento");
        String name2 = newScanner.next();

        // creo secondo evento
        Evento event2 = new Evento(secondDate, name);

        if (event2.name == event1.name && event2.date == event2.date) {
            System.out.println("i due eventi sono uguali");
        } else {
            System.out.println("i due eventi sono diversi");
        }

        Evento promemoria = event1.copiaEvento(-5);
        System.out.println(promemoria.date + promemoria.name);
    }

}
