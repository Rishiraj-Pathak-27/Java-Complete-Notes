// Convert All Odd Numbers to Zero

import java.util.Arrays;
public class oddsZero{
    public static int[] oddZero(int[] arr) {
        int n=arr.length;

        for(int i=0; i<n; i++) {
            if(arr[i] % 2 == 1){
                arr[i] = 0;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] res = oddZero(arr);
        System.out.println(Arrays.toString(res));

    }
}