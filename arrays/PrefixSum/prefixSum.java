// Given an integer array 'arr', return the prefix sum/running sum in the array

//(A) Approach 1 -> Using Auxiliary array

/* import java.util.Scanner;
import java.util.Arrays;

public class prefixSum {
    public static int[] prefSum(int[] arr){
        int n=arr.length;
        int[] pref = new int[n];

        // arr[0]=pref[0];

        // for(int i=1; i<n; i++){
        //     pref[i]=pref[i-1]+arr[i];
        // }
         
        // OR

        for(int i=0; i<n; i++){
            if(i<1){
                pref[i] = arr[i];
            }else{
                pref[i] = pref[i-1]+arr[i];
            }
        }
        return pref;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=ip.nextInt();
        }
        int[] res = prefSum(arr);
        System.out.println("Prefix sum = "+Arrays.toString(res));
    }
} */


//(B) Approach 2 -> (Without auxiliary array)

import java.util.Scanner;
import java.util.Arrays;

public class prefixSum{
    public static int[] prefSum(int[] arr){
        int n=arr.length;
        arr[0]=arr[0];
        for(int i=1; i<n; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    } 

    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=ip.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=ip.nextInt();
        }

        int[] res = prefSum(arr);
        System.out.println(Arrays.toString(res));
    }
}
