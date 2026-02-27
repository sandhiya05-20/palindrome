import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   Palindrome Checker - UC4");
        System.out.println("=================================");

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
        sc.close();
    }
}