public class Main {

    public static void main (String [] args) throws Exception{
        int num = Integer.parseInt(args[0]);
        int dem = Integer.parseInt(args[1]);
        if (dem == 0) {
            throw new ArithmeticException();
        }  
        Razionale rz = new Razionale(num, dem);
        System.out.println(rz.valore());
    }
    
}
