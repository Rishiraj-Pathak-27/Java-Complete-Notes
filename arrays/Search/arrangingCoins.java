// Approach 1 (Arithmetic Progression TC = O(1))

// public class arrangingCoins {
//     public static int sqrt(long x) {
//         long left=1, right=x;

//         while(left<=right){
//             long mid = left+(right-left)/2;

//             if(mid > x/mid){
//                 right = mid-1;
//             }else if(mid < x/mid){
//                 left = mid-1;
//             }else{
//                 return (int)mid;
//             }
//         }
//         return (int)right;
//     }

//     public static int approachOne(int n){
//         long m = (long) n;

//         return (sqrt(8*m+1)-1)/2;
//     }

//     public static void main(String[] args){
//         int n=13;

//         System.out.println(approachOne(n));
//     }
// }


// Approach 2 (Binary Search TC = O(log n))

public class arrangingCoins{
    public static int approachTwo(int n){
        int left = 0, right = n;
        int ans = 0;

        while(left<=right){
            long mid = left+(right-left)/2;
            long sum = mid*(mid+1)/2;
 
            if(sum == n) return (int)mid;

            else if(sum > n) {
                right = (int)mid-1;
            }else{
                ans=(int)mid;
                left = (int)mid+1;
            }
        }
        // return (int)right;
        return (int)ans;
    }

    public static void main(String[] args){
        int n=13;
        System.out.println(approachTwo(n));
    }
}