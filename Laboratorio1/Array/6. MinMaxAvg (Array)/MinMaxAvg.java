/* Scrivere un programma che riceva in input da riga di comando un intero n. Il programma deve leggere da standard input una sequenza di n valori interi e deve stampare a video il valore minimo, massimo e medio tra i valori letti.

Oltre al metodo main, devono essere definiti ed utilizzati almeno i seguenti metodi:

public static int minimo(int[] in) che restituisce il minimo valore intero presente in in.
public static int massimo(int[] in) che restituisce il massimo valore intero presente in in.
public static float media(int[] in) che restituisce un valore reale pari alla media aritmetica dei valori interi presenti in in. */


public class MinMaxAvg {
    
    public static void main (String[] args) {
        int [] nums = new int [args.length];
        nums[0] = Integer.parseInt(args[0]);
        nums[1] = Integer.parseInt(args[1]);
        nums[2] = Integer.parseInt(args[2]);

        minimo(nums);
        massimo(nums);
        media(nums);
    }


    public static int minimo(int[] in)  {
        int minimo = 103242424;
        for ( int elem : in) {
            if (elem< minimo) {
                minimo = elem;
            }
        }
        System.out.println(minimo);
        return minimo;
    }

    public static int massimo(int[] in) {
        int massimo =-3242432;
        for (int num : in) {
            if (num > massimo) {
                massimo = num;
            }
        }
        System.out.println(massimo);
        return massimo;
    }

    public static float media(int[] in) {
        int tot = 0;

        for (int numero : in) {
            tot += numero;
        }
        System.out.println(tot / in.length);
        return  (float) tot / in.length;
    } 
    
}
