// public class diagonalSum {

//     public static int sum(int[][] arr){
//         int n=arr.length;

//         int sum=0;

//         for(int i=0; i<n; i++){
//             sum+=arr[i][i];
//         }

//         return sum;
//     }

//     public static void main(String[] args){
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

//         System.out.println("Normal diagonal sum = "+sum(arr));
//     }
// }



// 2.

public class diagonalSum{
    public static int sum(int[][] arr){
        int n=arr.length;
        int sum=0;

        for(int i=0; i<n; i++){
            sum+=arr[i][n-1-i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Secondary diagonal sum = "+sum(arr));
    }
}