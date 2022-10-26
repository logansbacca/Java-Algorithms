import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class romani {
    public static void main(String[] args) {
        String input = args[0];
        valida(input);

    }

    // Checks the conversion type
    public static void valida(String entrada) {
        int resp = 0;
        int count = 0;
        ArrayList<Character> places = new ArrayList<>();
        places.add('I');
        places.add('V');
        places.add('X');
        places.add('L');
        places.add('C');
        places.add('M');
        places.add('D');

        for (int i = 0; i < entrada.length(); i++) {
            Character l = entrada.charAt(i);
            if (places.contains(l)) {
                count++;
            }
        }

        if (count == entrada.length()) {
            romanToInt(entrada);
            return;
        };
        

        try {
            resp = Integer.parseInt(entrada);
            intToRoman(resp);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("invalid input");
        }

    }

    public static String intToRoman(int r) {
        String intToRoman = "";

        int numsVal[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numsVal.length; i++) {
            while (r >= numsVal[i]) {
                sb.append(romans[i]);
                r -= numsVal[i];
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static int romanToInt(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int ans = 0;
        int n = s.length();
        char prev = s.charAt(n-1);
        
        for(int i=n;i>0;i--){
            char curr = s.charAt(i-1);
            if(h.get(curr)<h.get(prev))
                ans-=h.get(curr);
            else
                ans+=h.get(curr);
            prev = curr;
        }
        System.out.println(ans);
        return ans;
    }
    
}
