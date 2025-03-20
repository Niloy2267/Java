import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call the function to calculate factorial
        long factorial = calculateFactorial(num);

        // Display the result
        System.out.println("The factorial of " + num + " is " + factorial);
    }

    // Method to calculate factorial
    public static long calculateFactorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}