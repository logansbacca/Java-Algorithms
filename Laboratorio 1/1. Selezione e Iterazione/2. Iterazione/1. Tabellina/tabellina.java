public class tabellina {

public static void main (String[]args){
   int num = Integer.parseInt(args[0]);

   for (int index = 1; index <= num+1 ; index++) {
        int res = num * index;
        System.out.println(res);
   }
   
}
    
}
