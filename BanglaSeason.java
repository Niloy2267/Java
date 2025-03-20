 import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input month number
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        
        // Using if statement to determine the season
        String season = "";
        
        if (month == 1 || month == 2) {
            season = "গ্রীষ্ম (Summer)";
        } else if (month == 3 || month == 4) {
            season = "বর্ষা (Rainy)";
        } else if (month == 5 || month == 6) {
            season = "শরৎ (Autumn)";
        } else if (month == 7 || month == 8) {
            season = "হেমন্ত (Pre-Winter)";
        } else if (month == 9 || month == 10) {
            season = "শীত (Winter)";
        } else if (month == 11 || month == 12) {
            season = "বসন্ত (Spring)";
        } else {
            season = "Invalid month! Please enter a number between 1 and 12.";
        }
        
        System.out.println("The season is: " + season);
    }
} 
    

