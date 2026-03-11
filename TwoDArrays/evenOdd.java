import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter rows & cols: ");
        int n=ip.nextInt();
        int m=ip.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter elements: ");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = ip.nextInt();
            }
            System.out.println();
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] % 2 == 0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
        }

        System.out.println("Even count = "+evenCount);
        System.out.println("Odd count = "+oddCount);
    }
}
