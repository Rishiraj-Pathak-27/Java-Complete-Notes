/* public class elementSum {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {10,20,30,40,50,60};

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = "+sum);
    }
} */

// using user input

import java.util.Scanner;
public class elementSum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = ip.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = "+sum);
    }
}