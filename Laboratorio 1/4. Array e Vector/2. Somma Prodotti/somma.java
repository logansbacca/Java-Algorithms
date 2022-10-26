import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class somma {
    public static void main (String[] args) {
        int [] numbers = new int [args.length];
        for (int index = 0; index < numbers.length; index++) {
          numbers[index] = Integer.parseInt(args[index]);
        }
        System.out.print(calcola(numbers));
    }

    public static int calcola(int[] n) {
        int tot = 0;
        for (int index = 0; index < n.length; index= index+2) {
            tot = tot +(n[index] * n[index+1]);
            System.out.println(n[index]);
        }
        return tot;
    }
   

}
