// WAP to multiply odd indexed elements by 2 & add 10 to even indexed numbers.

public class addMulArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                arr[i] = arr[i] + 10;
            } else {
                arr[i] = arr[i] * 2;
            }

            System.out.print(arr[i]+" ");
        }
    }   
}