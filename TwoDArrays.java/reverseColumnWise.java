public class reverseColumnWise {
    public static void main(String[] args){
        int[][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};

        int n=arr.length;
        int m=arr[0].length;

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
