// WAP to find out the maximum subarray sum using brute force approach // T.C. -> O(n^2)


import java.util.Scanner;
public class bruteForceApp{

    public static int maxSubArrSum(int[] arr){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;

        for(int start=0; start<n; start++){
            int sum=0;
            for(int end=start; end<n; end++){
                sum += arr[end];
                maxSum = Math.max(maxSum,sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter total elements: ");
        int n=ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = ip.nextInt();
        }
        
        System.out.println("Maximum subarry sum = "+maxSubArrSum(arr));
    }
    }