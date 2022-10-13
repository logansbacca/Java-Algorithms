

public class segno {
    public static void main (String [] args){
        String a = args[0];
        int b = Integer.parseInt(a);
        String res = "";
        if (b > 0) {
            res = "+";
        };
        System.out.println(res+b);

    }

}