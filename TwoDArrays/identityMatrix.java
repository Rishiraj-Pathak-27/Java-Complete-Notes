public class identityMatrix {

    public static boolean isIdentity(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        if(n!=m) return false;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==j) {
                    if(arr[i][j] != 1){
                        return false;
                    }
                }else {  // (i!=j)
                    if(arr[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[][] arr = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        System.out.println(isIdentity(arr));
    }
}
