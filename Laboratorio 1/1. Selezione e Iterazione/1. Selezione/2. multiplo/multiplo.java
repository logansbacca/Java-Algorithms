public class multiplo {
    public static void main (String [] args){
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        if (first % second == 0) {
            System.out.println("multiplo");
        }else {
            System.out.println("non multiplo");
        }
    
        
    }

}