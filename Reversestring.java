import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the input string
        String reversed = reverse(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);

        // Close the scanner
        scanner.close();
    }

    // This method reverses the given string using StringBuilder
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
