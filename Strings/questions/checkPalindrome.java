// WAP to check wheather the string is palindrome or not (2 Pointer technique) T.C. -> O(n)

public class checkPalindrome {
    public static boolean isPalindrome(String str){
        int n=str.length();

        int left=0, right=n-1;

        while(left<=right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str = "racecar";

        System.out.println(isPalindrome(str));
    }    
}
