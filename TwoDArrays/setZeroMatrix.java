// WAP to set matrix zeros. If an element is 0, set entire row & column to 0.

public class setZeroMatrix {

    public static void zeros(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;


        // this is used to mark the flag to first row and col and also mark the 1st row col elements to 0
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0){
                    if(i == 0) firstRowZero = true;
                    if(j == 0) firstColZero = true;
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // this is used to mark the inner elements 0 based on their corresponding 0 in 1st row col
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }

        //this is used to check the 1st row col, if any 0 found make complete row col 0
        if(firstRowZero){
            for(int j=0; j<m; j++){
                arr[0][j] = 0;
            }
        }

        if(firstColZero){
            for(int i=0; i<n; i++){
                arr[i][0] = 0;
            }
        }
         
        // to print the final matrix
        for(int[] a:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    } 

    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,0,7,8},{9,10,11,12},{13,14,15,0}};

        zeros(arr);
    }
}


// Approach 2 (Using auxiliary arrar for setting -1 where ever 0 founds)

// public class setZeroMatrix{
//     public static void zeros(int[][] arr){
//         int n=arr.length;
//         int m=arr[0].length;

//         int[] rowZero = new int[n];
//         int[] colZero = new int[m];

//         // OR add boolean flags for rows and cols

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(arr[i][j] == 0){
//                     rowZero[i] = -1;
//                     colZero[j] = -1;
//                 }
//             }
//         }

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(rowZero[i] == -1 || colZero[j] == -1){
//                     arr[i][j] = 0;
//                 }
//             }
//         }


//         for(int[] a : arr){
//             for(int b : a){
//                 System.out.print(b+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args){
//         int[][] arr = {{1,2,3},{4,0,6},{7,8,9}};
//         zeros(arr);
//     }


// }