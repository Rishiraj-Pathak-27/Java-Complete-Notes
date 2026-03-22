// Find the Last Occurrence of a Target

import java.util.Scanner;
public class lastAppearance {
    
    public static int lastOccurance(int[] arr, int target) {
        int n = arr.length;
        int index = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] == target) {     
                index = i;
                index++;
            }
        }
        return (index-1);             // last num++ will becomes result + 1 so we sub 1 from the result
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");

        for(int i=0; i<n; i++){
            arr[i] = ip.nextInt();
        }

        System.out.print("Enter target Element: ");
        int target = ip.nextInt();

        System.out.println("Last Occurance at index = "+lastOccurance(arr, target));
    }
}