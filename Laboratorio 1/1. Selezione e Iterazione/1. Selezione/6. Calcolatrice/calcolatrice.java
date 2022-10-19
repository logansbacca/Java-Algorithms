public class calcolatrice {
    public static void main(String[] args) {
        int operation = 0;

        switch (args[0]) {
            case "+":
                operation = Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
                break;
            case "-":
                operation = Integer.parseInt(args[1]) - Integer.parseInt(args[2]);
                break;
            case "*" : 
                operation = Integer.parseInt(args[1]) * Integer.parseInt(args[2]);
                break;
            case "/": 
                operation = Integer.parseInt(args[1]) / Integer.parseInt(args[2]);
                break;
        }

        System.out.println(operation);
    }

}
