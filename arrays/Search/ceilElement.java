// WAP to find the ceil element from a sorted array

public class ceilElement {
    public static int ceilFinder(int[] arr, int x){
        int n=arr.length;

        int left=0, right=n-1;

        int idx=-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid] < x){
                left = mid+1;
            }else{
                idx=mid;
                right = mid-1;
            }
        }
        return idx;
    }
       public static void main(String[] args){
        int[] arr = {1,2,5,8,10,25,55,95};
        int x = 56;

        System.out.println("We found ceil at idx "+ceilFinder(arr,x));
    }
}
