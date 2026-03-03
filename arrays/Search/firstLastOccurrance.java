import java.util.ArrayList;
public class firstLastOccurrance {
    public static ArrayList<Integer> returnFirstLast(int[] arr, int target){
        int n=arr.length;
        int left = 0, right = n-1;
        int idx=-1;

        ArrayList<Integer> ans = new ArrayList<>();

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target){
                idx=mid;
                right = mid-1;
            }else if(arr[mid] > target){
                right = mid-1;
            }else left = mid+1;
        }

        ans.add(idx);

        left=0;
        right=n-1;
        idx=-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target){
                idx=mid;
                left = mid+1;
            }else if(arr[mid] > target){
                right = mid-1;
            } else left = mid+1;
        }
        ans.add(idx);
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,3,5,5,5,5,96,96,205};
        int target = 5;

        System.out.println(returnFirstLast(arr,target));
    }
}
