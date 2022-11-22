import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;

public class Famiglia {
    double reddito;
    int dimensione;

    public static void main(String[] args) {

        double vitto = Integer.parseInt(args[0]);
        double alloggio = Integer.parseInt(args[1]);

        List<Famiglia> poorFam = new ArrayList<Famiglia>();

        Scanner newscanner = new Scanner(System.in);

        System.out.println("inserisci reddito e dimensione dela famiglia");
        ArrayList<String> in = new ArrayList<String>();
        while (newscanner.hasNext()) {
            String line = newscanner.next();
            String[] rd = line.split(" ");
            for (int index = 0; index < rd.length; index++) {
                in.add(rd[index]);
            }
            if (in.size() > 1) {
                double reddito = Double.parseDouble(in.get(0));
                int dimensione = Integer.parseInt(in.get(1));
                Famiglia fam = new Famiglia(reddito, dimensione);
                if (fam.sottoSogliaPoverta(alloggio, vitto)) {
                    poorFam.add(fam);
                }
                in.clear();
            }

        }

        System.out.println("ci sono " + poorFam.size() + " famiglie sotto la soglia di povertà");

        for (int index = 0; index < poorFam.size(); index++) {
            System.out.println("Nella famiglia " + (index + 1) + " ci sono " + poorFam.get(index).dimensione
                    + " persone con reddito di euro " + poorFam.get(index).reddito);
        }

    }

    public Famiglia(double reddito, int dimensione) throws InputMismatchException {
        if (dimensione < 0) {
            throw new InputMismatchException();
        }
        this.reddito = reddito;
        this.dimensione = dimensione;
    }

    public boolean sottoSogliaPoverta(double costoCasa, double costoCibo) throws InputMismatchException {
        if (costoCasa < 0 || costoCibo < 0) {
            throw new InputMismatchException();
        }
        if (costoCasa + this.dimensione * costoCibo > reddito / 2) {
            return true;
        }

        return false;
    }

}