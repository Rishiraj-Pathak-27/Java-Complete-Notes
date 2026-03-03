// WAP to find the floor element from a sorted array

public class floorElement {
    public static int floorFinder(int[] arr, int x){
        int n=arr.length;

        int left = 0, right = n-1;

        int idx = -1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] > x){
                right = mid-1;
            }else{
                idx=mid;
                left = mid+1;
            }
        }
        return idx;
    }
    public static void main(String[] args){
        int[] arr = {1,2,8,10,15,25,35,95};
        int x = 12;

        System.out.println("Floor is at idx "+floorFinder(arr,x));
    }
}
