// WAP to find the first occurrance of the element to be searched using binary search if it has more than 1 occurrance

public class findLastOccurrance {
    public static int lastOccurrance(int[] arr, int target){
        int n=arr.length;

        int left = 0, right = n-1;
        int idx = -1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target){
                idx=mid;
                left = mid+1;
            }else if(arr[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return idx;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,3,4,5,5,5,5,7,8,10,15};
        int target = 1;

        System.out.println(lastOccurrance(arr,target));
    }
}
