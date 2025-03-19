import java.util.Scanner;

class AlternatingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i % 2 == 0) ? -i : i;
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
