// Replace Every Element with Its Double


import java.util.Arrays;
public class DoubleArray {
    public static int[] doubleArray(int[] arr) {
        int n = arr.length; 
        int doubleArr[] = new int[n];

        for(int i=0; i<n; i++) {
            doubleArr[i] =  arr[i] * 2;
        }
        return doubleArr;
    }
    
    public static void main(String []args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        int[] result = doubleArray(arr);
        System.out.println("Double array = "+Arrays.toString(result));

    }
}