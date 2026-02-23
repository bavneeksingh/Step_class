import java.util.*;
import java.util.Scanner;
public class PalindromeChecker{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter a string to check palindrome: ");
        String input = scanner.nextLine();

        // UC3 - String Reverse Method
        System.out.println("\nUC3 - Using String Reverse:");
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(reversed) ? "Palindrome" : "Not Palindrome");



    }
}