import java.util.*;
import java.util.Scanner;
public class PalindromeChecker{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter a string to check palindrome: ");
        String input = scanner.nextLine();

        // UC7 - Deque Method (Optimized)
        System.out.println("\nUC7 - Using Deque (Optimized):");
        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindromeDeque = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindromeDeque = false;
                break;
            }
        }
        System.out.println(isPalindromeDeque ? "Palindrome" : "Not Palindrome");


    }
}