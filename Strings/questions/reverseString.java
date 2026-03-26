// WAP to reverse the string

public class reverseString {
    public static void main(String[] args){
        String str = "john";
        int n=str.length();
        String res = "";

        for(int i=n-1; i>=0; i--){
            res += str.charAt(i);
        }

        System.out.println(res);
    }    
}
