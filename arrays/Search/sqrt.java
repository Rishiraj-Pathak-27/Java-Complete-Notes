// WAP to find the floor sqrt of a given number 

// Approach using binary search (O(log n))

public class sqrt {
    public static int sqrtNumber(int n){
        int left=1, right=n;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(mid > n/mid){
                right = mid-1;
            }else if(mid < n/mid){
                left = mid+1;
            }else{
                return mid;
            }
        }
        return right;
    }
    public static void main(String[] args){
        int n = 55;

        System.out.println(sqrtNumber(n));
    }
}
