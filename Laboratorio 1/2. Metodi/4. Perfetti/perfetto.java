public class perfetto {
    public static void main (String [] args){
        int n = Integer.parseInt(args[0]);
        if(n == 0 ){
            return;
        }
        sommaDivisoriPropri(n);
        boolean res = perfetto(n);

        if (res){
            System.out.print("perfetto");
        } else {
            System.out.print("non perfetto");
        }
    }


    public static int sommaDivisoriPropri(int n){
        int somma = 0;
        for (int i =1; i<n; i++){
            if (n % i == 0) {
                somma += i;
            }
        }
        return somma;
        
    }

    public static boolean perfetto(int n){
        int perf = sommaDivisoriPropri(n);
        if (perf == n) {
            return true;
        } else {
            return false;
        }
    }


}
