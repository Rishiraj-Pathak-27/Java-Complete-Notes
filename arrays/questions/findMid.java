import java.util.Scanner;
public class findMid {
    public static int middle(int[] arr){
        int n=arr.length;
            if(n%2==1){
                return arr[n/2];
            }else{

                return -1;
            }
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Define array size: ");
        int n=ip.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=ip.nextInt();
        }

        System.out.println("Middle Element = "+middle(arr));

    }
}
