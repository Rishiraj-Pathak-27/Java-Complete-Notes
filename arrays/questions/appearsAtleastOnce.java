// Check if Target Appears At Least Once

import java.util.Scanner;
public class appearsAtleastOnce {
    
    public static boolean isAppeared(int[] nums, int x) {
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(nums[i] == x) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n = ip.nextInt();
    int[] arr = new int[n];

    System.out.print("Enter array Elements: ");
    for(int i=0; i<n; i++) {
        arr[i] = ip.nextInt();
    }

    System.out.println();
    System.out.println("Enter target Element: ");
    int target = ip.nextInt();

    System.out.println("Element Appeared = "+isAppeared(arr,target));
    
    }
}