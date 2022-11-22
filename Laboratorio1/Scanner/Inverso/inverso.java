import java.util.Scanner;

public class inverso {
    public static void main(String[] args) {
        char ch = ' ';
        String str = "";
        String line = "";
        Scanner newscanner = new Scanner(System.in);
        while (newscanner.hasNext()) {
            line = newscanner.nextLine();
            for (int index = 0; index <line.length(); index++) {
               ch = line.charAt(index);
               str = ch + str;
            }
            str = "\n" + str;

        }
        System.out.println(str);
    }

}
