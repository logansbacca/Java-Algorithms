public class cerchio {
    
    public static void main (String [] args) {
        double raggio = Double.parseDouble(args[0]);
        System.out.println(CalcolaArea(raggio));
        System.out.println(CalcolaCirconferenza(raggio));
    }
    
    public static double CalcolaArea(double raggio){      
        final double pi = 3.141592653589793;  
        double area = (raggio * raggio) * pi;
        return area;
    }

    public static double CalcolaCirconferenza(double raggio) {
        final double pi = 3.141592653589793;
        double circonferenza = 2* (pi * raggio);
        return circonferenza;
    }


}
