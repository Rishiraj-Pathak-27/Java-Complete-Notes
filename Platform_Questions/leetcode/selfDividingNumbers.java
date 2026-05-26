// 728. Self Dividing Numbers
// import java.util.List;
// import java.util.ArrayList;
// public class Solution {

//     public static int count(int n){
//         int count=0;

//         while(n!=0){
//             int rem=n%10;
//             count++;
//             n/=10;
//         }
//         return count;
//     }

//     public static boolean helper(int n){
//         int copy=n;
//         int count=0;
//         int digits=count(n);


//         while(n!=0){
//             int rem = n%10;

//             if(rem==0) return false;

//             if(copy%rem==0){
//                 count++;
//             }
//             n/=10;
//         }
//         if(count==digits){
//             return true;
//         }
//         return false;
//     }


//     public List<Integer> selfDividingNumbers(int left, int right) {

//         List<Integer> ans = new ArrayList<>();

//         for(int i=left; i<=right; i++){
//             if(helper(i)){
//                 ans.add(i);
//             }
//         }
//         return ans;
//     }
    // public static void main(String[] args) {
    //     int left=1, right=22;
    //     System.out.println(selfDividingNumbers(left,right));
    // }
// }

// OR

import java.util.ArrayList;
import java.util.List;
public class selfDividingNumbers {

    public static boolean helper(int n){
        if(n <= 0){
            return false;
        }

        int copy=n;
        int count=0;

        while(n!=0){
            int rem = n%10;

            if(rem==0 || copy%rem!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }


    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<>();

        for(int i=left; i<=right; i++){
            if(helper(i)){
                ans.add(i);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int left=1, right=22;
        System.out.println(selfDividingNumbers(left,right));
    }
}
