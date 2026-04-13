// 387. First Unique Character in a String
// Approach 1) Optimal T.C -> (O(N)) S.C -> (O(1))

public class nonRepeatingChar {

    public static int nonRepeating(String s){
        int n=s.length();
        int[] arr = new int[26];

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int idx = ch-97;

            arr[idx]++;
        }

        
        for(int i=0; i<26; i++){
            char minChar=s.charAt(i);
            int idx = minChar-97;

            if(arr[idx] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String s = "rishiraj";

        System.out.println("Idx of non repeating char = "+nonRepeating(s));
    }
} 
