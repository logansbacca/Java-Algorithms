import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class sommaunici {

    // check if number is int 
    // keep counter for each int
    public static void main (String[] args) {
        var a = leggiNumeri();

        for (int index = 0; index < args.length; index++) {
            var toInt = Integer.parseInt(args[index]);
            a.add(toInt);
        }
        //a.forEach(System.out::println);
        occorrenze(a, 8);
    }

   public static List<Integer> leggiNumeri() {
        List<Integer> lst = new ArrayList <>();
        return lst;
   }

   public static int occorrenze(List<Integer> numeri, int n) {
    int counter = 0;
 
    counter = Collections.frequency(numeri, n);

    System.out.print(counter);
    return counter;
}

}

