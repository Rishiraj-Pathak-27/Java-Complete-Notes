// Reverse the array using ArrayList

import java.util.ArrayList;

public class reverseElements {
    public static void swap(ArrayList<Integer> arr, int i, int j){
        int temp = arr.get(i);
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
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        reverse(arr);
        System.out.println(arr);
    }
}


// OR (using Collections.reverse())

/* import java.util.Collections;
import java.util.ArrayList;

public class reverseElements {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        Collections.reverse(arr);
        System.out.println(arr);
    }
} */
