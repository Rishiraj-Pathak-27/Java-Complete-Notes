// WAP to find the common elements among two unsorted arrays
// TC = O(n log n)
import java.util.ArrayList;
import java.util.Arrays;
public class commonElements {
    public static ArrayList<Integer> CommonFunction(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        int i=0, j=0;

        ArrayList<Integer> ans = new ArrayList<>();

        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }else if(a[i]<b[j]){
                i++;
            }else{
                j++;
            }
        }
        return ans;
    }  
    public static void main(String[] args){
        int[] a = {3,4,2,2,4,10,21,12,4};
        int[] b = {3,2,2,7,10,10,3,2,1,4};

        System.out.println(CommonFunction(a,b));
    }
}
