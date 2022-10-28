import java.util.Scanner;

public class cesar {
    public static void main (String [] args) {
        int k = args[0];
        CifraTesto(leggiTesto(),k)
    }

    public static String leggiTesto() {
        String output = ""
        Scanner newscanner = new Scanner(System.in);
        while (newscanner.hasNext()) {
            String line = newscanner.next();
            output += line;
        }
        return output;
    }

    public static char cifraCarattere(char c, int chiave) {
            String alfabeto = "abcdefghijklmopqrstiuvwxyz"
            for (int index = 0; index < alfabeto.length; index++) {
                if (alfabeto.charAt(index) == c ) {
                    c = (alfabeto.charAt(index) + c) % 26;
                }
            }
            return c;
    }

    public static String CifraTesto(String s, int chiave){
        char carattere = '';
        char s = '';
        for (int index = 0; index < s.length; index++) {
            carattere = s.charAt(index);
            s = cifraCarattere(carattere, chiave);
        }
    }


}


