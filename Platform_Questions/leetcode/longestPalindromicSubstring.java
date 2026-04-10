// Find longest palindromic substring

import java.util.Scanner;
public class longestPalindromicSubstring {

    // function used to help the longestPalindrome() function to get the check if the string is palindromic or not
    public static boolean isPalindromic(String s){
        int n=s.length();

        int left=0, right=n-1;

        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static String longestPalindrome(String s){
        int n=s.length();


        // used to store the max value
        String max = s.charAt(0)+"";

        for(int i=0; i<n; i++){
            for(int j=i; j<=n; j++){
                if(isPalindromic(s.substring(i,j))){

                    String str = s.substring(i,j);

                    // to check which string has is maximum length str or max
                    max = (str.length() > max.length()) ? str : max;

                     // OR

                    // if(str.length() > max.length()){
                    //     max=str;
                    // }
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = ip.nextLine();

        System.out.println("Longest palindromic substring = "+longestPalindrome(str));
    } 
}
