// the array list in java is another way to declare and initialize the arrays 
// speciality of the array list is that it is dynamic i.e we can add n number of elements in it and can change its size even after declaration

// syntax --> ArrayList<datatype> arr_name = new ArrayList<>();

import java.util.ArrayList;
public class arrayList{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        
        // access the element
        System.out.println(arr.get(2));  // used to access the element = arr[2]

        // update
        arr.set(3,100);        // used to update the element of the array = arr[3] = 100
        System.out.println(arr);        // only used to print the whole array no loop required
        // also this is not traversing the array by ourselves

        // add between
        arr.add(2,1);
        System.out.println(arr);

        // to get the length of the array we use arr.size() here
        int n = arr.size();
        System.out.println(n);

        
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();

        for(int ele : arr){
            System.out.print(ele+" ");
        }

        System.out.println();

        arr.add(1,320);
        System.out.println(arr);

    }
} 

