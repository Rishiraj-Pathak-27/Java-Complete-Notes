import java.util.*;
public class arrayAddition {
    public static ArrayList<Integer> addition(int[] arr1, int[] arr2){
        int n1= arr1.length;
        int n2 = arr2.length;
        
        ArrayList<Integer> total = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int carry=1;
        for(int i=n1-1; i>=0; i--){
            for(int j=n2-1; j>=0; j--){

                if(arr1[i]+arr2[j] <= 9){
                    total.add(arr1[i]+arr2[j]);
                    carry=0;
                }else{
                    ans.add(arr1[i]+arr2[j]);
                    total.add(ans.get(1));
                    carry=ans.get(0);
                }
            }
        }
        if(carry==ans.get(0)) total.add(ans.get(0));
        Collections.reverse(total);
        return total;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,3,4};

        ArrayList<Integer> res = addition(arr1,arr2);
        System.out.println(res);
    }
}
