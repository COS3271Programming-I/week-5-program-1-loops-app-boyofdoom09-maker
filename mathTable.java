package test;
import java.util.Scanner;

public class Im {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 3 and 20: ");
        int n = scanner.nextInt();

        if (n < 3 || n > 20) {
            System.out.println("Please enter a valid number.");
            return;
        }

        // Use %4d for the header
        System.out.print("   "); 
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        
        // Adjust the line length to match %4d
        for (int i = 0; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d|", i);
            for (int j = 1; j <= n; j++) {
                // Use %4d for the grid results
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
