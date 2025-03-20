 import java.util.Scanner;

public class SeriesEvalution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int sum = 0;

        // Loop through the series and calculate the sum
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i; // Add the odd terms (1, 3, 5, ...)
            } else {
                sum -= i; // Subtract the even terms (2, 4, 6, ...)
            }
        }

        // Output the result
        System.out.println("The sum of the series is: " + sum);
     
    
}
    }
