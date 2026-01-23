import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class reverse{
    public static void swap(ArrayList<Integer> arr, int i, int j){
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        int i=0;
        int j=arr.size()-1;

        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        System.out.println("Define array Size = ");
        int n = ip.nextInt();

        System.out.println("Define array elements: ");
        for(int i=0; i<n; i++){
            arr.add(ip.nextInt());
        }

        ArrayList<Integer> res = reverse(arr);
        System.out.println(res);

    }
}

