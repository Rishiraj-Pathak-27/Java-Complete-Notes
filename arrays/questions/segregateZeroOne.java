// Segregate 0's & 1's  (all 0's to left and all 1's to right)

/* import java.util.*;
public class segregateZeroOne {
    public static void segregate(int[] arr){
        int zeros = 0;
        int ones = 0;

        for(int ele : arr){
            if(ele==0){
                zeros++;
            }else{
                ones++;
            }
        }

        for(int i=0; i<zeros; i++){
            arr[i] = 0;
        }
        for(int j=0; j<ones; j++){
            arr[zeros + j] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = ip.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = ip.nextInt();
        }
        segregate(arr);

        System.out.println(Arrays.toString(arr));
    }
} */

// OR (Swapping)

import java.util.Arrays;

public class segregateZeroOne{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int[] segregate(int[] arr){
       int i=0;
       int j=arr.length-1;
       while(i < j){
        if(arr[i] == 0) i++;
        if(arr[j] == 1) j--;
        if(i>j) break;
        if(arr[i] == 1 && arr[j] == 0) {
            swap(arr,i,j);
            i++;
            j--;
        }
       }
       return arr;
    }
    public static void main(String[] args){
        int[] arr = {0,0,0,1,0};
        int[] res = segregate(arr);
        System.out.println(Arrays.toString(res));
    }
}
