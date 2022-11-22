import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class minmax {

    public static void main (String [] args) {
    int num = 0;
    ArrayList<Integer> ls = new ArrayList <>();
    Scanner newScanner = new Scanner(System.in);

        while (newScanner.hasNext()){
            String line = newScanner.next();
            num = Integer.parseInt(line);
            ls.add(num);
        }

        minimo(ls);
        massimo(ls);
        media(ls);

    }

    public static int minimo(ArrayList <Integer> in)  {
        int minimo = 103242424;
        for ( int elem : in) {
            if (elem< minimo) {
                minimo = elem;
            }
        }
        System.out.println(minimo);
        return minimo;
    }

    public static int massimo(ArrayList <Integer> in) {
        int massimo =-3242432;
        for (int num : in) {
            if (num > massimo) {
                massimo = num;
            }
        }
        System.out.println(massimo);
        return massimo;
    }

    public static float media(ArrayList <Integer> in) {
        int tot = 0;

        for (int numero : in) {
            tot += numero;
        }
        System.out.println(tot / in.size());
        return  (float) tot / in.size();
    } 



}
