import java.util.*;
public class mergeTwoSorted {
    public static ArrayList<Integer> merger(int[] arr1, int[] arr2){
        
        ArrayList<Integer> merged = new ArrayList<>();
        
        for(int ele1 : arr1){
            merged.add(ele1);
        }

        for(int ele2 : arr2){
            merged.add(ele2);
        }
        
        Collections.sort(merged);
        return merged;
    }
    public static void main(String[] args){
        int[] arr1 = {2,4,3,2,4};
        int[] arr2 = {9,8,5,6,2,1};

        ArrayList<Integer> res = merger(arr1,arr2);

        System.out.println(res);

    }
}
