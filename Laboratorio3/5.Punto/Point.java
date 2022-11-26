import java.util.Scanner;

public class Point{
    private double x;
    private double y;

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        while (newScanner.hasNext()) {
            double x = newScanner.nextDouble();
            double y = newScanner.nextDouble();
            Point myPoint = new Point(x,y);
        }
    } 


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // costruisce il punto di coordinate (x,x).
    public Point(double x) {
        this.x = x;
        this.y = x;
    }

    public Point(){
        this.x = 0;
        this.y = 0; 
    }


    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return this.x + "hello" +this.y;
    }

    /* public boolean equals(Object o) {
    return this.x == o.getX() && this.y == o.getY();
    }   */

    public double distanza(Point p) {
        return Math.sqrt(Math.pow((p.getX() - this.x), 2) + Math.pow(p.getY() - this.x, 2)); 

    }

}
