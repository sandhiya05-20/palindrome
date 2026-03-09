import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("     Palindrome Checker - UC4     ");
        System.out.println("==================================");

        // Hardcoded string
        String word = "madam";

        boolean isPalindrome = true;

        int start = 0;
        int end = word.length() - 1;

        // UC4 : Two Pointer Palindrome Check
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


        // ==================================
        // UC5 : Stack Based Palindrome Check
        // ==================================

        System.out.println("\n==================================");
        System.out.println("     Palindrome Checker - UC5     ");
        System.out.println("==================================");

        String stackWord = "noon";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : stackWord.toCharArray()) {
            stack.push(c);
        }

        boolean stackPalindrome = true;

        // Pop and compare
        for (char c : stackWord.toCharArray()) {
            if (c != stack.pop()) {
                stackPalindrome = false;
                break;
            }
        }

        if (stackPalindrome) {
            System.out.println(stackWord + " is a Palindrome using Stack.");
        } else {
            System.out.println(stackWord + " is NOT a Palindrome using Stack.");
        }

        System.out.println("\nProgram Ended.");
    }
}