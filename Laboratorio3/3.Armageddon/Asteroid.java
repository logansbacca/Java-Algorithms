public class Asteroid {
   private double km;
   private int kg;

    public Asteroid (double km, int kg) {
        this.km = km;
        this.kg = kg;
    }


    public double force () {
        double squaredDistance = (this.km * this.km);
        double force = this.kg/squaredDistance;
        return force;
    }

    public int getKg () {
        return this.kg;
    }

    public double getKm () {
        return this.km;
    }


}
