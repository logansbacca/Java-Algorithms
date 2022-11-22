public class abbondanti {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        numeriAbbondanti(numero);
    }

    public static int sommaDivisoriPropri(int n) {
        int somma = 0;
        for (int index = 2; index < n; index++) {
            if (n % index == 0) {
                somma += index;
            }
        }
        return somma;
    };

    public static boolean abbondante(int n) {
        if (sommaDivisoriPropri(n) < n) {
            return false;
        } else {
            return true;
        }
    };

    public static void numeriAbbondanti(int limite) {

        for (int in = 1; in < limite; in++) {
            if (abbondante(in)) {
                System.out.print(in);
            }
        }
        
    };
}
