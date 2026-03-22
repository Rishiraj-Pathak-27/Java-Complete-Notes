// WAP to search a given element from a matrix

// Approach 1 (Using Binary Search (O(logn n)))

import java.util.Scanner;
public class sortedMatrixSearch{

    public static boolean isFound(int[][] arr, int target){
        int n=arr.length, m=arr[0].length;

        int left=0, right=m*n-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            int midRow = mid/m, midCol = mid%m;

            if(arr[midRow][midCol] == target) return true;
            else if(arr[midRow][midCol] > target) right = mid-1;
            else left = mid+1;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int row = ip.nextInt();
        int col = ip.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = ip.nextInt();
            }
        }

        System.out.println("Enter target: ");
        int target = ip.nextInt();

        System.out.println(isFound(arr,target));
    }   
}


// Approach 2 (Using down left search (O(logn n)))

// public class sortedMatrixSearch{

//     public static boolean isFound(int[][] arr, int target){
//         int n=arr.length;
//         int m=arr[0].length;

//         int i=0, j=n-1;

//         while(j>=0 && i<m){
//             if(arr[i][j] == target) return true;
//             else if(arr[i][j] < target) i++;
//             else j--;
//         }
//         return false;
//     }


//     public static void main(String[] args){
//         int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//         int target = 13;

//         System.out.println(isFound(arr,target));
//     }
// }