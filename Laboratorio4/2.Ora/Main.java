import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Time tm;
        if (args.length > 0) {
            String hr = args[0];
            String[] arr;
            arr = hr.split(":");
            int hour = Integer.parseInt(arr[0]);
            int minute = Integer.parseInt(arr[1]);
            if (args.length > 1) {
                String pm = args[1];
                tm = new Time(hour, minute, pm.equals("pm"));
            }else {
                tm = new Time(hour, minute);
            }
            
        } else {
           tm = new Time();
        }


      

        Scanner newScanner = new Scanner(System.in);
        printValues(tm);
        while (newScanner.hasNext()) {
            newScanner.next();
            int hr = newScanner.nextInt();
            int min = newScanner.nextInt();
            tm.avanca(hr,min);
            printValues(tm);
        }

    }

    public static void printValues (Time time) {  
        System.out.println("Orario:" + time.getOra24());
        System.out.println("Orario:" + time.getOra12());
    }

    
}

