import java.util.Scanner;

 public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        int sum = 0;
        int oddNumber = 1;

        // Loop to calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            sum += oddNumber * oddNumber;  // Add square of the odd number
            oddNumber += 2;  // Get the next odd number
        }

        // Output the result
        System.out.println("The sum of the series is: " + sum);
    }
}
