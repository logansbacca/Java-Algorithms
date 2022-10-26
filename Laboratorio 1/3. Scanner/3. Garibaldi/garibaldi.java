import java.util.Scanner;

public class garibaldi {

    public static void main (String[] args) {
        Scanner newscanner = new Scanner(System.in);
        String output = "";
        while (newscanner.hasNext()){
            String input = newscanner.next();
            for (int index = 0; index < input.length(); index++) {
                if ((input.charAt(index) == 'a') || 
                (input.charAt(index) == 'e') || 
                (input.charAt(index) == 'è') || 
                (input.charAt(index) == 'i') ||
                (input.charAt(index) == 'o') ||
                (input.charAt(index) == 'u')) {
                    output += 'u';
                }else {
                    output += input.charAt(index);
                }
            }
            output += " ";
        }

        System.out.println(output);
    }
    
}
