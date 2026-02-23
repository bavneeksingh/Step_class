import java.util.*;
import java.util.Scanner;
public class PalindromeChecker{

    public static void main(String[] args) {
        // UC2 - Hardcoded Palindrome
        // Take ONLY ONE INPUT for all remaining UC
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter a string to check palindrome: ");
        String input = scanner.nextLine();

        // UC4 - Character Array Method
        System.out.println("\nUC4 - Using Character Array:");
        char[] arr = input.toCharArray();
        boolean isPalindromeArray = true;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindromeArray = false;
                break;
            }
        }
        System.out.println(isPalindromeArray ? "Palindrome" : "Not Palindrome");

    }
}