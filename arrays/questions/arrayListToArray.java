// Convert an ArrayList<Integer> into an int[] array.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class arrayListToArray {
    public static int[] convertToArray(ArrayList<Integer> arr){
            int n=arr.size();
            int[] res = new int[n];

            for(int i=0; i<n; i++){
                res[i] = arr.get(i);
            }
            return res;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Define array size: ");
        int n=ip.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr.add(ip.nextInt());
        }


        System.out.println("Array List = "+arr);

        int[] res = convertToArray(arr);

        System.out.println("Simple array = "+Arrays.toString(res));


    }
}
