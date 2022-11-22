
public class Auto extends Fuel{
    private int maxVel;
    private int consMed;

    public Auto(int tank, int mv, int cm) {
        super(tank);
        this.maxVel = mv;
        this.consMed = cm;
    }
   

    public int getMaxVel() {
        return this.maxVel;
    }

    public int getConsMed() {
        return this.consMed;
    }

    public double calcPath(int km, int speed) {
        double time = 0;
        double calc = (double) km / speed;
        double test = (double) calc * 60;
        while (test >= 60) {
            time++;
            test = test - 60;
        }
        System.out.println((int) time + " hours " + " and " + (int) test + " minutes");
        return time;
    }

    
}
