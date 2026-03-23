import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetIndicesAfterSorting {
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);

        int n=arr.length;

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(arr[i] == target){
            ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,2,5,2,3};
        int target = 2;

        targetIndicesAfterSorting obj = new targetIndicesAfterSorting();
        System.out.println(obj.targetIndices(arr, target));
    }
}
