import java.util.Scanner;

class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1, odd = 1; i <= n; i++, odd += 2)
            sum += odd * odd;
        System.out.println("Sum: " + sum);
        sc.close();
    }
}