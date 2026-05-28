// OPTIMAL APPROACH 

// public class setMatrixZeros {

//     public static void setZeros(int[][] arr){
//         boolean firstCol = false, firstRow=false;
//         int n=arr.length;
//         int m=arr[0].length;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(arr[i][j] == 0){
//                     if(i==0) firstRow = true;
//                     if(j==0) firstCol= true;
//                     arr[i][0] = 0;
//                     arr[0][j] = 0;
//                 }
//             }
//         }

//         for(int i=1; i<n; i++){
//             for(int j=1; j<m; j++){
//                 if(arr[i][0] == 0 || arr[0][j] == 0){
//                     arr[i][j] = 0;
//                 }
//             }
//         }

//         if(firstRow){
//         for(int i=0; i<n; i++){
//                 arr[i][0] = 0;
//             }
//         }

//             if(firstCol){
//                 for(int j=0; j<m; j++){   
//                     arr[0][j] = 0;
//                 }
//             }
        
//         for(int[] ele1: arr){
//             for(int ele2: ele1){
//                 System.out.print(ele2+", ");
//             }
//         }
//     }

//     public static void main(String[] args){
//         int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};

//         setZeros(arr);
//     }
// }

// APPROACH USING AUXILIARY ARRAY

public class setMatrixZero{

    public static void setZeros(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        int[][] firstRow = new int[n][m];
        int[][] firstCol = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0){
                    firstRow[i][0]=-1;
                    firstCol[0][j]=-1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(firstRow[i][0] == -1 || firstCol[0][j] == -1){
                    arr[i][j]=0;
                }
            }
        }

        for(int[] ele1:arr){
            for(int ele2:ele1){
                System.out.print(ele2+" ");
            }
        }
    }

    public static void main(String[] args){
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeros(arr);
    }
}