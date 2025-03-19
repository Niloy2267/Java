import java.util.Scanner;

public class Fahrenheittocelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels, farn;
        System.out.print("Enter the Fahrenheit value ");
        cels = input.nextDouble();
        cels = 1.8 * cels + 32;
        System.out.print("Farenheit " + cels);
    }
}