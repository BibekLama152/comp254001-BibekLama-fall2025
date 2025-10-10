package Ex1;
import java.util.Scanner;

public class BibekLama_COMP254Lab3_Ex1 {

    public static int product(int m, int n) {
        if (n == 0) return 0;          
        return m + product(m, n - 1);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first positive integer (m): ");
        int m = sc.nextInt();
        System.out.print("Enter second positive integer (n): ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Product of " + m + " and " + n + " is: " + product(m, n));
    }
}
