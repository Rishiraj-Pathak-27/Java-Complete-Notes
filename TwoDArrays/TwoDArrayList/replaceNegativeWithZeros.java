// Replace Negative Numbers with 0

import java.util.ArrayList;
import java.util.Scanner;

public class replaceNegativeWithZeros {

    public static void print(ArrayList<ArrayList<Integer>> res){
        for(ArrayList<Integer> a : res){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> negativeWithZeros(ArrayList<ArrayList<Integer>> res){


        int n=res.size();
        int m=res.get(0).size();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(res.get(i).get(j) < 0){
                    res.get(i).set(j,0);
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);

        System.out.println("Enter size of array = ");
        int n=ip.nextInt(); 

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        System.out.println("Enter elements: ");

        for(int i=0; i<n; i++){

            ArrayList<Integer> arr = new ArrayList<>();

            for(int j=0; j<n; j++){
                arr.add(ip.nextInt());
            }
            res.add(arr);
        }

        negativeWithZeros(res);

        System.out.println("Updates Matrix");

        print(res);
      
    }
}
