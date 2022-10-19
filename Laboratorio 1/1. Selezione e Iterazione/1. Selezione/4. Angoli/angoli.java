public class angoli {
    public static void main ( String[] args) {
        final int triangolo = 180;
        int angolo1 = Integer.parseInt(args[0]);
        int angolo2 = Integer.parseInt(args[1]);
        int angolo3;
        angolo3 = triangolo - (angolo1+angolo2);
        if (angolo3 >0) {
            System.out.println(angolo3);
        } 
       
    }
}