public class sottostringhe {
    public static void main(String[] args) {
        String str = args[0];
        String x = "";
        String isPalindrome = "";
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j =  i+1; j <= str.length() - 1; j++) {
                x = str.substring(i, j);
                if (x.length() < 2) {
                    continue;
                }
                for (int index = x.length() - 1; index >= 0; index--) {
                    isPalindrome = isPalindrome + x.charAt(index);
                }
                if (x.equals(isPalindrome)) {
                    System.out.println(x);;
                }

                isPalindrome = "";

            }
        }
    }
}
