import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if a number is prime
        System.out.print("Enter a number to check if it's prime: ");
        int primeNum = scanner.nextInt();
        boolean isPrime = true;
        if (primeNum <= 1)
            isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(primeNum); i++) {
                if (primeNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(primeNum + (isPrime ? " is a prime number" : " is not a prime number"));

        scanner.close();
    }
}
