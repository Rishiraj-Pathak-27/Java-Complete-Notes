// Count the Elements That Are Perfect Squares

public class perfectSquares{
    public static int perfectSquare(int[] arr){
        
        int count = 0;

        for(int ele:arr){
            int sqrt = (int)Math.sqrt(ele);
            if(ele==sqrt*sqrt){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,4,5,9,7,16,81};
        System.out.println("Perfect Squares = "+perfectSquare(arr));

    }
}