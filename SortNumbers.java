import java.util.Arrays;
import java.util.Scanner;

class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Sorted numbers: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
        sc.close();
    }
}
