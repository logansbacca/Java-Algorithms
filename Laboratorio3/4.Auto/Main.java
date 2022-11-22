import java.util.Scanner;

public class Main {
    private int totLitri;

    public static void main(String[] args) {
        int tank = Integer.parseInt(args[0]);
        int maxVel = Integer.parseInt(args[1]);
        int consumed = Integer.parseInt(args[2]);
        Fuel myAuto = new Auto(tank, maxVel, consumed);
        getUserInput(myAuto);
    }

    public static void getUserInput(Fuel f) {

        if (f instanceof Auto) {
            Auto myAuto = (Auto) f;
            System.out.println("insert new path : L of gas, km to do, speed");
            Scanner sn = new Scanner(System.in);
            int totKm = 0;
            double totL = 0.0;
            while (sn.hasNext()) {
                int L = Integer.parseInt(sn.next());
                int km = Integer.parseInt(sn.next());
                int speed = Integer.parseInt(sn.next());
                totL = (float) totL + L;
    
                if (speed < myAuto.getMaxVel() && speed > 1) {
                    myAuto.calcPath(km, speed);
                } else if (speed > myAuto.getMaxVel()) {
                    System.out.println("L'auto non va così veloce. velocità limitata a 200 km/h");
                    speed = myAuto.getMaxVel();
                    myAuto.calcPath(km, speed);
                } else {
                    System.out.println("Non puoi andare a velocità negativa o nulla");
                    System.out.println("ti rimangono " + totL + " di carburante");
                    System.out.println("insert new path : L of gas, km to do, speed");
                    continue;
                }
    
                double gasLeft = myAuto.gasLeft(totL, km, myAuto.getConsMed());
                if (gasLeft > 0) {
                    totL = gasLeft;
                    System.out.println("gas left " + totL);
                } else {
                    System.out.println("Non hai carburante sufficiente");
                    System.out.println(totL);
                    continue;
                }
    
                totKm = totKm + km;
                System.out.println("insert new path : L of gas, km to do, speed");
            }
            System.out.println("km tot trascorsi " + totKm);

        }
       
    }

}
