public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   Palindrome Checker - UC2");
        System.out.println("=================================");

        // Hardcoded string
        String word = "madam";

        boolean isPalindrome = true;

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}