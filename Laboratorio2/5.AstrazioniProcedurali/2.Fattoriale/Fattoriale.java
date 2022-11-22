import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
public class Fattoriale {
   
    public static void main(String[] args) {
        List <Integer> lista = listaFattoriali(Integer.parseInt(args[0]));
        stampaFattoriali(lista);
        fattoriale(lista.get(lista.size()-1));
    }

    public static int fattoriale(int n) {
        return n;
    }

    public static List<Integer> listaFattoriali(int n) {
        int res = 1;
        List <Integer> fattoriali = new ArrayList <Integer>();
        for (int i=1; i<=n; i++){
          res = res *i;
          fattoriali.add(res);
        }
        return fattoriali; 
    }

    public static void stampaFattoriali(List<Integer> lista) {
        int index = 0;
        for (Integer item : lista) {
            System.out.print(index+1);
            System.out.print(":");
            System.out.println(item);
            index++;
        }
        return;
    }


}
