import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args){

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1); arr1.add(2); arr1.add(3);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(10); arr2.add(20); arr2.add(30);

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(7); arr3.add(8); arr3.add(4);

        // ArrayList of ArrayList i.e 2D ArrayList is created using multiple ArrayList
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.add(arr1); res.add(arr2); res.add(arr3);

        System.out.println(res);

        System.out.println(res.get(1).get(2));
        System.out.println(res.get(0).get(0));

        res.get(2).set(1,100);

        System.out.println(res);

        res.get(2).add(12);

        System.out.println(res);

        // Printing the 2D array list using loop

        // for(int i=0; i<res.size(); i++){
        //     for(int j=0; j<res.get(i).size(); j++){
        //         System.out.print(res.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }

        // Printing the 2D array list using for each loop

        for(ArrayList<Integer> a : res){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }


        System.out.println(res.get(2));




    }    
}
