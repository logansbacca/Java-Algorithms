import java.util.Scanner;

public class farfallino {
    public static void main(String[] args) {
        String vocale = "";
        String consonante = "";
        String output = "hello";
        Scanner newscanner = new Scanner(System.in);
        int counter = 0;

        while (newscanner.hasNext()) {
            String input = newscanner.next();
            for (int index = 0; index < input.length(); index++) {
                if ((input.charAt(index) == 'a') ||
                        (input.charAt(index) == 'e') ||
                        (input.charAt(index) == 'è') ||
                        (input.charAt(index) == 'i') ||
                        (input.charAt(index) == 'o') ||
                        (input.charAt(index) == 'u')) {
                    vocale = String.valueOf(input.charAt(index));
                    vocale = "" + vocale + 'f' + vocale;
                    output += vocale;
                } else {
                    consonante = String.valueOf(input.charAt(index));
                    output += consonante;
                }
            }
            output += " ";
        }
    }

}
