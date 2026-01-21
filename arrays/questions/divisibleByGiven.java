//Count How Many Elements Are Divisible by a Given Number

public class divisibleByGiven {
    public static int divisible(int[] arr, int given){
        int n = arr.length;
        int count = 0;

        for(int i : arr){
            if(i % given == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,10,3,15,4,20};
        int given = 5;

        System.out.println("Counts of divisibility = "+divisible(arr,given));
    }
}