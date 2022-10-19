public class palindroma {
    public static void main (String [] args) {
        String word = args[0];
        String isPalindrome = "";

        for (int index = word.length()-1; index>=0; index--) {
            isPalindrome = isPalindrome + word.charAt(index);
        }
        System.out.println(isPalindrome);

        if (word.equals(isPalindrome)) {
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
