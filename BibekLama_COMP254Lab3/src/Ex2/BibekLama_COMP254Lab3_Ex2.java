package Ex2;
import java.util.Scanner;

public class BibekLama_COMP254Lab3_Ex2 {

    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true; // base case
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        String text = input.toLowerCase().replaceAll("\\s+", ""); 
        boolean result = isPalindrome(text, 0, text.length() - 1);

        if (result)
            System.out.println("\"" + input + "\" is a palindrome.");
        else
            System.out.println("\"" + input + "\" is not a palindrome.");
    }
}
