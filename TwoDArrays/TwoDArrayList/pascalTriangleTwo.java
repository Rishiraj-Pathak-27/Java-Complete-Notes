// 119. Pascal's Triangle II
// Given an integer n, return the n (0-indexed) row of the Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly.

/* import java.util.*;
public class pascalTriangleTwo {

    public static List<Integer> pascalsTwo(int n){


        // for 0 indexing

        int rowIdx = n+1;


        // 2D list to store the multiple lists

        List<List<Integer>> list = new ArrayList<>();

        // outer loop to traverse throught rows

        for(int i=0; i<rowIdx; i++){

            // list to store the elements of 2D lists

            List<Integer> res = new ArrayList<>();

            // inner loop to traverse through columns till i

            for(int j=0; j<=i; j++){

                // filling boundaries with 1

                if(j==0 || j==i){
                    res.add(1);
                }else{

                    // storing the sum of previous elements arr[i][j] = arr[i-1][j] + arr[i-1][j-1]

                    int val = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                    res.add(val);
                }
            }
            list.add(res);
        }

        return list.get(n);
    }

    public static void main(String[] args){
        int n=4;

        System.out.println(pascalsTwo(n));
    }
} */


import java.util.*;
public class pascalTriangleTwo{

    public static List<Integer> pascalsTwo(int n){
        int rowIdx = n+1;
        
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<rowIdx; i++){

            List<Integer> res = new ArrayList<>();

            for(int j=0; j<=i; j++){
                res.add(1);
            }

            list.add(res);
        }

        for(int i=0; i<rowIdx; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    list.get(i).set(j,1);
                }else{
                    int val = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                    list.get(i).set(j,val);
                }
            }
        }
        return list.get(n);
    }

    public static void main(String[] args){
        int n=4;

        System.out.println(pascalsTwo(n));

    }
}
