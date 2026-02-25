import java.util.ArrayList;

public class unionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length ||  j < b.length) {

            while(i>0 && i<a.length && a[i]==a[i-1]){
                i++;
            }

            while(j>0 && j<b.length && b[j]==b[j-1]){
                j++;
            }
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }else if(a[i]<b[j]){
                ans.add(a[i]);
                i++;
            }
            else{
                ans.add(b[j]);
                j++;
                i++;
            }
        }

        // while (i < a.length) {
        //     ans.add(a[i]);
        //     i++;
        // }

        // while (j < b.length) {
        //     ans.add(b[j]);
        //     j++;
        // }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 2, 2, 3, 4, 5 };
        int[] b = { 1, 1, 2, 3, 4 };

        System.out.println(findUnion(a, b));
    }
}
