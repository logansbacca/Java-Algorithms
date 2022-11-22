import java.lang.Exception;


public class Razionale {
    private int numero;
    private int denominatore;

    public Razionale(int num, int den) {
        this.numero = num;
        this.denominatore = den;
    }

    public int getNum() {
        return this.numero;
    }

    public int getDen() {
        return this.denominatore;
    }

    public void setNum(int num) {
        this.numero = num;

    }

    public void setDen(int den) {
        this.denominatore = den;
    }

    public double valore() {
      return (float)  this.numero / this.denominatore;
    } 

}
