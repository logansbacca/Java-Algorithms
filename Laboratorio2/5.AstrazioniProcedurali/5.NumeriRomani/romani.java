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
        
     
        resp = Integer.parseInt(entrada);
        intToRoman(resp);
        

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
        HashMap <Character, Integer> roman2int = new HashMap<Character, Integer>();
        roman2int.put('I', 1);
        roman2int.put('V', 5);
        roman2int.put('X', 10);
        roman2int.put('L',50);
        roman2int.put('C',100);
        roman2int.put('D',500);
        roman2int.put('M',1000);
        int convertedVal = 0;
        char prev = s.charAt(s.length()-1);
    
        for (int i=s.length(); i>0; i--) {
            char curr = s.charAt(i-1);
             
            if (roman2int.get(curr) < roman2int.get(prev)) {
                convertedVal -= roman2int.get(curr);
            } else {
                convertedVal += roman2int.get(curr);
                prev = curr;
            }
            

        }
        System.out.println(convertedVal);
        return convertedVal;
    }
    
}
