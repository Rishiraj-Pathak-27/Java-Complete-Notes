// Segregate 0's , 1's & 2's (all 0's to left , all 1's to mid & all 2's to end)

/* import java.util.Arrays;
public class segregateZeroOneTwo {
    public static void segregate(int[] arr){
       int ones = 0;
       int zeros = 0;
       int two = 0;
       
       for(int ele : arr){
          if(ele == 0){
            zeros++;
          }else if(ele==1){
            ones++;
          }else {
            two++;
          }
       }

       for(int i=0; i<zeros; i++){
        arr[i] = 0;
       }

       for(int j=0; j<ones; j++){
        arr[zeros+j] = 1;
       }

       for(int k=0; k<two; k++){
        arr[ones+zeros+k] = 2;
       }
    }
    public static void main(String[] args){
        int[] arr = {1,2,0,2,0,1,2,0};
        segregate(arr);

        System.out.println("Segregated Array = "+Arrays.toString(arr));
    }
} */


