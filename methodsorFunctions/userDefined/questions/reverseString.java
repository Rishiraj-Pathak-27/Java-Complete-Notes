// Write a method reverseString(String s) to reverse a String.

public class reverseString {
    
    public static String reverseString(String s) {
        int start = 0;
        int end = s.length()-1;
        String reverse = "";
       

        for(int i = end; i >= start; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String s = "Rishiraj";
        
        System.out.println("Before Reverse = "+s);
        System.out.println("After Reverse = "+reverseString(s));
    }
}