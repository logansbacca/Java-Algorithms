import java.util.Scanner;

public class testo {

    public static void main(String[] args) {
        int lines = 0;
        int words = 0;
        int counter = 0;
        Scanner newscanner = new Scanner(System.in);
        while (newscanner.hasNextLine()) {

            String line = newscanner.nextLine();
            String w[] = line.split(" ");
            String l[] = line.split("\n");

            words += w.length;
            lines += l.length;

            for (int i =0; i<w.length; i++){
                String x = w[i];
                for (int z=0; z<x.length(); z++){
                    counter = counter + 1;
                }
            }
        }

        System.out.println("numero linea : " + lines );
        System.out.println("numero parole : " + words);
        System.out.println("media : " + counter/words);

    }

}
