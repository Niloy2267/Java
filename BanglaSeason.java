import java.util.Scanner;

class BanglaSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        switch (month) {
            case 1, 2 -> System.out.println("Winter");
            case 3, 4 -> System.out.println("Spring");
            case 5, 6 -> System.out.println("Summer");
            case 7, 8 -> System.out.println("Rainy");
            case 9, 10 -> System.out.println("Autumn");
            case 11, 12 -> System.out.println("Late Autumn");
            default -> System.out.println("Invalid month");
        }
        sc.close();
    }
}