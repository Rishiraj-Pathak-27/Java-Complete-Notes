// Find Second Element of the Array (If Exists)

public class secondElement{

    public static int secElement(int[] arr){
        
        if(arr.length<2){
            return -1;
        }
        return arr[1];
    }
    public static void main(String[] args){
        int[] arr = {10,20};
        System.out.println(secElement(arr));
    }
}