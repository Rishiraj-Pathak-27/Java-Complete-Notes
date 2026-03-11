public class reverseColumWise {
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

    public static void reverseColumn(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        for(int j=0; j<m; j++){
            int up=0, down=m-1;

            while(up<down){

                int temp=arr[up][j];
                arr[up][j] = arr[down][j];
                arr[down][j] = temp;
                
                up++;
                down--;
            }
            System.out.println();
        }
        print(arr);
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        reverseColumn(arr);
    }
}
