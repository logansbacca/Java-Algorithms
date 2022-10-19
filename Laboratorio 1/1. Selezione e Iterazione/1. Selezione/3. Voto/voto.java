public class voto {
    public static void main (String [] args) {
        int v = Integer.parseInt(args[0]);
        if (v <60) {
            System.out.println("insufficente");
        }else if (v<70 && v >60){
            System.out.println("sufficente");
        } else if(v>=70 && v<80) {
            System.out.println("buono");
        } else if (v>=80 && v<90){
            System.out.println("distinto");
        } else if (v>=90 && v<=100) {
            System.out.println("ottimo");   
        }else if (v<0 || v>100) {
            System.out.println("errore");
        }
        
    }
}
