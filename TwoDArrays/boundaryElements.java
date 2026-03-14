// Print Boundary Elements

public class boundaryElements {

    public static void diagonalPrinting(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(j==0 || j==m-1 || i==0 || i==n-1){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,2,4,1}, {6,3,1,0}};
        diagonalPrinting(arr);

    }
}
