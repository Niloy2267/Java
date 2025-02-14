import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Factorial of a number
        System.out.print("Enter a number to find factorial: ");
        int factNum = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= factNum; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);

        scanner.close();
    }
}
