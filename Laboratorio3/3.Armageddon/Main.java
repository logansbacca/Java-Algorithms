import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double limit = Double.parseDouble(args[0]);
        List <Asteroid> lista = read();
        List<Asteroid> dangerousAsteroid = new ArrayList();
        for (Asteroid asteroid : lista) {
            if (flag(asteroid.force(), limit)) {
                dangerousAsteroid.add(asteroid);
            }
        }

        display(dangerousAsteroid);
    }

    // metodo pra ler as entradas static private
    private static List read() {
        List<Asteroid> mylist = new ArrayList();

        Scanner newscanner = new Scanner(System.in);

        System.out.println("digit a new asteroid entry km and kg");
        while (newscanner.hasNext()) {
            int kg = newscanner.nextInt();
            double km = newscanner.nextDouble();
            Asteroid ast = new Asteroid(km, kg);
            mylist.add(ast);
            System.out.println("digit a new asteroid entry km and kg");
        }
        return mylist;
    }

    private static boolean flag(double force, double limit) {
        return force >= limit;
    }

    private static void display(List <Asteroid> dangerousAsteroid) {
        for (Asteroid asteroid : dangerousAsteroid) {
            System.out.println(asteroid.getKm()+ " "+asteroid.getKg());        
        }
    }

}