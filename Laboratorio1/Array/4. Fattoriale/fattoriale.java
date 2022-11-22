import java.util.List;
import java.util.ArrayList;

public class fattoriale {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        Fattoriali(numero);
    }


    public static List<Integer> Fattoriali(int n) {
        List<Integer> myList = new ArrayList<Integer>();
        int factorial = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            myList.add(factorial);
        }

        myList.forEach(System.out::println);
        return myList;

    }

}
