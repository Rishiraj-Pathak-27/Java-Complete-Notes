public class validPalindrome {

    public static boolean isPalindrome(String str){
        String lower = str.toLowerCase();
        String replace = lower.replaceAll("[^a-z0-9]", "");

        System.out.println(replace);

        int left = 0, right = replace.length()-1;

        while(left<=right){
            if(replace.charAt(left) == replace.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(str));
    }
}
