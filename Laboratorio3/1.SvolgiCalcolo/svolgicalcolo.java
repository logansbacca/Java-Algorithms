import java.util.InputMismatchException;
import java.util.Scanner;

public class svolgicalcolo {

    public static void main(String[] args) {
        CalcolatriceConMemoria Miacalc;
        if (args.length > 0) {
            Miacalc = new CalcolatriceConMemoria(Double.parseDouble(args[0]));
        } else {
            Miacalc = new CalcolatriceConMemoria();
        }
        System.out.println(Miacalc.getMem());
        System.out.println(Miacalc.getMem());
        Scanner tastiera = new Scanner(System.in);

        while (tastiera.hasNext()) {
            char op = tastiera.next().charAt(0);
            if (op == '=')
                break;
            double o2 = tastiera.nextDouble();
            try {
                Miacalc.operate(op, o2);
            } catch ( DivideByZeroException e) {
                System.out.print(e.getMessage());
            } catch (InputMismatchException f){
                System.out.print(f.getMessage());
            }
            System.out.println(Miacalc.getMem());

        }

    }

}
