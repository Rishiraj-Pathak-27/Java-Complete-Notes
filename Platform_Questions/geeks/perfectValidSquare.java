// Approach 1 (T.C. -> O(underoot (n)))

// import java.util.Scanner;
// public class perfectValidSquare {

//     public static boolean validSquare(int n){
//         for(long i=1; i*i<=n; i++){
//             if(i*i == n){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter n: ");
//         int n=ip.nextInt();

//         System.out.println(validSquare(n));

//     }
// }

// Approach 2 (Binary Search) T.C. -> O(log n)

import java.util.Scanner;
public class perfectValidSquare {

    public static boolean validSquare(int n){
       long left = 0,right=n;

       while(left<=right){
        long mid = left+(right-left)/2;

        if(mid*mid < n){
            left = mid+1;
        }else if(mid*mid > n){
            right = mid-1;
        }else{
            return true;
        }
       }
       return false;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=ip.nextInt();

        System.out.println(validSquare(n));

    }
}
