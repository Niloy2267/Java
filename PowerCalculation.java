import java.util.Scanner;

class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        int base = sc.nextInt(), exp = sc.nextInt(), result = 1;
        for (int i = 0; i < exp; i++)
            result *= base;
        System.out.println("Result: " + result);
        sc.close();
    }
}
