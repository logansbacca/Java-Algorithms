import java.util.HashMap;

class Roman2Int {

    public static void main(String[] args) {
        romanToInt(args[0]);
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
        return convertedVal;
    }
}
