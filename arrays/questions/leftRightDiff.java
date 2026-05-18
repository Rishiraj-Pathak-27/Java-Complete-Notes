// Left and Right Sum Differences

import java.util.Arrays;
public class leftRightDiff {

    public static int[] lRDiff(int[] arr){
        int n=arr.length;
        int leftSum=0;
        int rightSum=0;

        for(int ele:arr){
            rightSum+=ele;
        }

        int[] res = new int[n];
        for(int i=0; i<n; i++){
            leftSum+=arr[i];
            res[i] = Math.abs(rightSum-leftSum);
            rightSum=rightSum-arr[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {10,4,8,3};
        int[] res = lRDiff(arr);
        System.out.println("Ans = "+Arrays.toString(res));
    } 
}
