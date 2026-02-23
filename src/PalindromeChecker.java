import java.util.*;
import java.util.Scanner;
public class PalindromeChecker{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter a string to check palindrome: ");
        String input = scanner.nextLine();
        // UC6 - Queue + Stack Method
        System.out.println("\nUC6 - Using Queue + Stack:");
        Stack<Character> stack2 = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : input.toCharArray()) {
            stack2.push(c);
            queue.add(c);
        }

        boolean isPalindromeQS = true;
        while (!stack2.isEmpty()) {
            if (!stack2.pop().equals(queue.remove())) {
                isPalindromeQS = false;
                break;
            }
        }
        System.out.println(isPalindromeQS ? "Palindrome" : "Not Palindrome");




    }
}