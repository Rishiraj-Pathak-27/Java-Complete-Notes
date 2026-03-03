// WAP to find the first occurrance of the element to be searched using binary search if it has more than 1 occurrance

public class findFirstOccurrance {

    public static int firstOccurrance(int[] arr, int target){
        int n=arr.length;
        int left=0, right=n-1;

        int idx = -1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target) {
                idx = mid;
                right = mid-1;
            }else if(arr[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return idx;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int target = 6 ;
        System.out.println("First Occurance is at idx "+firstOccurrance(arr,target));
    }
}
