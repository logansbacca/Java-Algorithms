public class Fuel {
    private int tank;

    public Fuel (int tank) {
        this.tank = tank;
    }

    public int getTank() {
        return this.tank;
    }


    // litri riforniti - (km da percorre) / (consumo medio) = carburante rimanente

    public double gasLeft(double newFill, int km, int consMed) {

        double gas = newFill - (km / consMed);

        return gas;
    }

}
