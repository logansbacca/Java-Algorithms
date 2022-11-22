import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class medie {
    public static void main (String [] args) {
        List<Integer> al=new ArrayList<Integer>();
        double media = 0.0;
        for (int i = 0; i<args.length; i++){
            int in = Integer.parseInt(args[i]);
            al.add(in);     
        };

        for (int el : al) {
            media = media + el;
            
        }
        System.out.println(media /al.size());
    }
}
