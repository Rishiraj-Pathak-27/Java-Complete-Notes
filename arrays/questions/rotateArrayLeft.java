// rotate the array towards left by n position

import java.util.Arrays;
public class rotateArrayLeft {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }

    public static int[] rotateLeft(int[] arr, int rotate){
        int n=arr.length;
        rotate = rotate % n;

        reverse(arr,0,rotate-1);
        reverse(arr,rotate,n-1);
        reverse(arr,0,n-1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int rotate = 10;
        System.out.println(Arrays.toString(arr));
        int[] res = rotateLeft(arr,rotate);
        System.out.println(Arrays.toString(res));
    }
}
