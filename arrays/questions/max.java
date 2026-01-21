import java.util.Scanner;
public class max{
    public static void main(String []args) {

        // taking input
        Scanner ip = new Scanner(System.in);
        System.out.print("Array Size: ");
        int n = ip.nextInt();
        int[] arr = new int[n];


        System.out.println("Array Elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        // always initialize another variable after taking input
        // calculating max & printing output 

        int max =  arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Value = "+max);
    }
}