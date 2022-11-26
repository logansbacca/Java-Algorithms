import java.util.List;
import java.util.ArrayList;

public class Abbondanti {
    public static void main(String[] args) {
    int soglia = Integer.parseInt(args[0]);
       sommaDivisoriPropri(soglia);
    }


    public static List<Integer> elencoDivisoriPropri(int n) {
        List <Integer> divisori = new ArrayList <Integer>() ;
        for (int index = 1; index < n; index++) {
            if ( n % index == 0 ){
                divisori.add(index);
            }
        }
        System.out.println(divisori);
        return divisori;
    }


    public static int sommaDivisoriPropri(int n){
        elencoDivisoriPropri(n);
        return 5;
    }


    public static boolean abbondante(int n) {
        return true;
    }


   /*  public static List<Integer> numeriAbbondanti(int limite){
        
    } */


    public static void stampaNumeriAbbondanti(List<Integer> numeri){

    } 








}
