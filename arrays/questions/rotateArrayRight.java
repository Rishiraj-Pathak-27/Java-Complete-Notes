// rotate the array towards right by n position

import java.util.*;
public class rotateArrayRight {

    public static void swap(int i, int j, int[] arr) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

    public static int[] reverse(int[] arr, int i, int j) {
    
        while(i<j){
            swap(i,j,arr);
            i++;
            j--;
        }
        return arr;
    }

    public static int[] rotateRight(int[] arr, int rotate) {
        int n = arr.length;
        rotate = rotate % n;    // condition to rotate the array only required times that has been entered i.e high number = low rotations

        reverse(arr,0,n-1);
        reverse(arr,0,rotate-1);
        reverse(arr,rotate,n-1);

        return arr;
    }
    
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter the position by which you want to rotate the array: ");
        int rotate = ip.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rotateRight(arr,rotate)));
    }
}