import java.util.Scanner;

public class Areaofcirlce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, Area;
        System.out.print("Enter the radius");
        r = input.nextDouble();
        Area = 3.1416 * r * r;
        System.out.print("Area= " + Area);

    }
}