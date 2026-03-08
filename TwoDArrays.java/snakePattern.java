// WAP to print the 2D array in snake pattern row wise

/* public class snakePattern {

    public static void snakePrinting(int[][] arr){

        int n=arr.length;
        int m=arr[0].length;

        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<m; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int k=m-1; k>=0; k--){
                    System.out.print(arr[i][k]+" ");
                }
            }
            System.out.println();
            }
        }

    public static void main(String[] args){
        int[][] arr = {{5,4,1,2}, {1,1,3,5}, {4,2,3,4}, {3,6,2,5}};

        snakePrinting(arr);
    }
} */


// WAP to print the 2D array in snake pattern column wise


public class snakePattern{

    public static void snakePrinting(int[][] arr){

        int n=arr.length;
        int m=arr[0].length;

        for(int j=0; j<m; j++){
            if(j%2==1){
                for(int i=n-1; i>=0; i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=0; i<n; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

}
    public static void main(String[] args){

        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};

        snakePrinting(arr);

    }
}
