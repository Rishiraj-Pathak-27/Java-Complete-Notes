// Check if the First and Last Element Are Equal

public class firstLastEqual {
    public static boolean firstLastEquality(int[] arr){
        int n=arr.length;

        if(arr[0]==arr[n-1]){
            return true;
        }else{

            return false;
        }
    }
    public static void main(String[] args){
        int[] arr = {15,4,2,5,6,151};
        System.out.println("Equal? = "+firstLastEquality(arr));
    }
}
