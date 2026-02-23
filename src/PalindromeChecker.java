import java.util.*;
import java.util.Scanner;
public class PalindromeChecker{

    public static void main(String[] args) {
        // UC2 - Hardcoded Palindrome
        // Take ONLY ONE INPUT for all remaining UC
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter a string to check palindrome: ");
        String input = scanner.nextLine();

        // UC5 - Stack Method
        System.out.println("\nUC5 - Using Stack:");
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String stackReverse = "";
        while (!stack.isEmpty()) {
            stackReverse += stack.pop();
        }
        System.out.println(input.equals(stackReverse) ? "Palindrome" : "Not Palindrome");
    }
}