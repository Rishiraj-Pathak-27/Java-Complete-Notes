public class arrayTranspose{
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        int[][] res = new int[m][n];

        print(arr);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                res[j][i] = arr[i][j];
            }
            System.out.println();
        }
        return res;
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{9,8,4,5},{1,2,0,7}};

        System.out.println(transpose(arr));
        
    }
}