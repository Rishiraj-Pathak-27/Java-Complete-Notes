import java.util.Arrays;
public class firstAndLastPosition {
    public static int[] searchRegion(int[] arr,int target){
        int[] result = {-1,-1};
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]==target){
                result[0]=i;
                break;
            }
        }

        for(int j=n-1; j>=0; j--){
            if(arr[j]==target){
                result[1] = j;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int target=8;
        int[] res = searchRegion(arr,target);
        System.out.println(Arrays.toString(res));
    }
}
