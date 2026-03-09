import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Method 1: Using reverse string
    public static boolean checkUsingReverse(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    // Method 2: Using stack
    public static boolean checkUsingStack(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equalsIgnoreCase(reversed);
    }

    // Method 3: Using two pointers
    public static boolean checkUsingTwoPointers(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Reverse method timing
        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(input);
        long end1 = System.nanoTime();

        // Stack method timing
        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long end2 = System.nanoTime();

        // Two pointer timing
        long start3 = System.nanoTime();
        boolean result3 = checkUsingTwoPointers(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + result1 + " Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method: " + result2 + " Time: " + (end2 - start2) + " ns");
        System.out.println("Two Pointer Method: " + result3 + " Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}