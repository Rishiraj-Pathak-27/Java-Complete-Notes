// Create an Array of Absolute Values

import java.util.*;
public class absArray{
    public static int[] helper(int[] arr) {
        int n = arr.length;
        int[] absArr = new int[n];

        for(int i=0; i<n; i++) {
            absArr[i] = Math.abs(arr[i]);
        }
        return absArr;
    }

    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = ip.nextInt();

        int[] arr = new int[n];
        
        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = ip.nextInt();
        }

        int[] res = helper(arr);
        System.out.println("Absolute Array = "+Arrays.toString(res));
    }
}
