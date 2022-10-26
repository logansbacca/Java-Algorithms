import java.lang.Math;

public class primi {

    public static void main (String [] args) {
        int soglia = Integer.parseInt(args[0]);

        if (soglia == 0 || soglia == 1) {
            System.out.print("La soglia inserita non è positiva`");
            return;
        }
    
        
       numeriPrimi(soglia);
    
    }
    

    public static boolean primo(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
              count++;
            }
          }
          if (count > 1) {
            return false;
          } 
          return true;
    }

     public static void numeriPrimi(int limite){

        for (int i = 2; i<limite; i++){
            if (primo(i)) {
                System.out.print(i);
            }
        }

    } 
}
