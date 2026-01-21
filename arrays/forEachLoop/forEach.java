// For Each loop in java is used to traverse the complete array or any other data structure
// During traversing it cannot be able to modify those elements

// syntax -> for(datatype variable : arr_name) {  // code for traversing }

//eg.

/* public class forEach {
    public static void main(String []args) {
        int[] arr = {3,4,2,54,65,1,3,4};
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
} */

//eg. where it cannot be used (modification of elements)

public class forEach {
    public static void main(String []args) {
        int[] arr = {3,4,2,54,65,1,3,4};
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }

        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}
