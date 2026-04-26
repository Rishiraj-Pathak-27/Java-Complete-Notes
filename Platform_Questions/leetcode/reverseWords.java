// 151. Reverse Words in a String

public class reverseWords {

    public static String reverse(String s){

         // 1. remove whitespaces from front and end of the string
        // 2. split the complete string using regex where \\s will be used to remove the white spaces from the string and + will check the occurrances of the white spaces and check with its posterior whitespace if got 2 occurrances then it will keep only 1.
        // in short make the string clean with one white space in between each word, always get stored in a string array 
        s = s.trim();
        String[] arr = s.split("\\s+");

        int n = arr.length;
        
        StringBuilder sb = new StringBuilder();

        for(int i=n-1; i>=0; i--){
            sb.append(arr[i]);
            // to avoid the last blank space
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String s = "  the   sky  is too  much dark       ";
        System.out.println(reverse(s));
    }
}
