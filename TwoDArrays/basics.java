// Two Dimensional Arrays are in the form of grid or matrix, which are used to store the values in the form of rows and columns
 

// Printing a default array

// In 2D array, arr.length = no. of rows & arr[0].length = no. of cols

// public class basics {
//     public static void main(String[] args){
//         int[][] arr = new int[3][3];

//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Creating our own 2D array

/* public class basics{
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{4,5,6,5},{7,8,9,1}};

        System.out.println(arr[1][2]);

        // Before Update

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }   
        
        arr[2][0] = 10;

        // After Update

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }   
    }
} */


// Taking input in 2D array

import java.util.Scanner;
public class basics{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter total number of rows and columns");
        int rows = ip.nextInt();
        int cols = ip.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements: ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = ip.nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


