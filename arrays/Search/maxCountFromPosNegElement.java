// WAP to count the maximum count from both Positive and Negative Integers from a sorted array

public class maxCountFromPosNegElement {

    public static int lowerBound(int[] arr, int left, int right, int target){
        int n=arr.length;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] <= target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return right;
    }
    public static int maxCount(int[] arr){

        int n=arr.length;

        int left=0, right=n-1;

        int negPos = lowerBound(arr,left,right, -1);
        int posPos = lowerBound(arr,negPos, right, 0);

        int negCount = negPos;
        int posCount = n-posPos;

        return Math.max(negCount, posCount);
    }
    public static void main(String[] args){
        int[] arr = {-3,-2,-1,0,0,1,2};

        System.out.println(maxCount(arr));
    }
}
