public class singleNumber {
    public static int singleFromDoubles(int[] arr){
        int ans=0;

        for(int ele : arr){
            ans ^= ele;
        }
        return ans;
    }    

    public static void main(String[] args){
        int[] arr = {1,3,2,3,5,1,2};
        System.out.println("Single Number = "+singleFromDoubles(arr));
    }
}
