import java.util.Scanner;

 public class LargestNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user how many numbers they want to input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Initialize the array
        int[] numbers = new int[n];
        
        // Take input for the array elements
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Initialize largest to the first element
        int largest = numbers[0];
        
        // Loop through the array to find the largest number
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        
        // Print the largest number
        System.out.println("The largest number is " + largest);
        
        // Close the scanner
        scanner.close();
    }
}
