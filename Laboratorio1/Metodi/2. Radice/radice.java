import java.lang.Math;

public class radice {
    
    public static void main (String [] args) {
        int n = Integer.parseInt(args[0]);

        if (n <= 0) { 
            System.out.print("Il valore inserito non appartiene al dominio della funzione");
            System.out.print(radiceQuadrata(n));
        } else {
            System.out.print(radiceQuadrata(n));
        }
    }

    public static double radiceQuadrata(double n) {
        if (n<0) {
            System.out.print(0);
            return 0;
        }else {
            double res = Math.sqrt(n);
            return res;
            
        }
    }
}
