// Find the Count of Elements Greater Than a Given Value

import java.util.Scanner;
public class greaterElementCount {
    
    public static int greaterCount(int[] arr, int element) {
        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++) {
            if(arr[i]>=element){
                count++;
            }
        }
        return count;
    }
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = ip.nextInt();
        }

        System.out.println("Enter the element: ");
        int element = ip.nextInt();

        System.out.println("Count of elements greater then given element = "+greaterCount(arr,element));
    }
}