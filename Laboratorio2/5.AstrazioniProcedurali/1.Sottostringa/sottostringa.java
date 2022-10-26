public class sottostringa {
    public static void main(String[] args) {

        if (args.length >= 1) {
            boolean result = subString(args[0], args[1]);
            System.out.println(result);
        } else {
            System.out.println("numero di argomenti inseriti invalidi");
        }

    }

    public static boolean subString(String text, String word) {
        boolean result;

        if (word == null) {
            System.out.println("Paramentri invalidi");
            return false;
        }

        return text.contains(word);
    }
}
