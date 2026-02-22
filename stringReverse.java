public class stringReverse {
    public static String reverse(String str){
        String reverse = "";
        int n=str.length();
        for(int i=n-1; i>= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }   
    
    public static void main(String[] args){
        String s = "abcd";
        System.out.println(reverse(s));
    }
}
