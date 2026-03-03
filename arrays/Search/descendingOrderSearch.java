public class descendingOrderSearch {
    public static int descendingSearch(int[] arr, int target){
        int n=arr.length;

        int left = 0, right = n-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target) return mid;
            else if(arr[mid] < target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {9999,9911,615,510,47,9,-4,-76};
        int target = -4;
        
        System.out.println("Element found at index "+descendingSearch(arr,target));
    }
}
