// KADANES BEST APPROACH TO FIND THE MAX SUBARRAY SUM

import java.util.Scanner;
public class kadanesApproach {

    public static int maxSum(int[] arr){
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int ele : arr){
            sum+=ele;
            max = Math.max(max,sum);

            if(sum<0) sum=0;
        }
        return max;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n=ip.nextInt(); 

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = ip.nextInt();
        }

        System.out.println("Maximum subarray sum = "+maxSum(arr));


    }    
}
