// WAP to find the Kth missing positive number from sorted array

public class KPositiveMissing {

    public static int positiveMissing(int[] arr, int k){
        int n=arr.length;

        int left=0, right=n-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            int missingNo = mid+1;
            int totalMissing = arr[mid] - missingNo;

            if(totalMissing >= k){
                right = mid-1;
            }else{ // (totalMissing < k)
                left = mid+1;
            }
        }
        return left+k;
        // OR
        // return right+1+k;
    }

    public static void main(String[] args){
        int[] arr = {1,2,5,7,8};
        int k = 3;

        System.out.println("Positive Missing number = "+positiveMissing(arr,k));
    }
}
