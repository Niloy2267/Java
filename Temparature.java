import java.util.Scanner;

public class Temparature{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a degree in Fahrenheit
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Output the result
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius.");
        
    }
}
