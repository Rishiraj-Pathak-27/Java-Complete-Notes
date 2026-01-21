// Find How Many Elements Are Zero

public class countZeros {
    public static int zeroCounter(int[] arr){
        int count=0;

        for(int ele : arr){
            if(ele==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {0,5,0,3,0,9,0,0};
        System.out.println("Count of Zeros = "+zeroCounter(arr));   
    }
}
