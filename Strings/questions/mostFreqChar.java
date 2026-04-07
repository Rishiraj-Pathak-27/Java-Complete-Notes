// WAP to find out the most frequent character from the string

// Approach 1 (Brute Force T.C. -> (O(N^2)))

/* public class mostFreqChar{

    public static char mostFrequent(String str){
        int n=str.length();
        int maxCount=0;
        char ans = str.charAt(0);

        // outer loop used to traverse the whole string
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            int count=0;

            // inner loop traverse & compare the each char with ith char
            for(int j=i+1; j<n; j++){
                if(str.charAt(j) == ch){
                    count++;        // used to store count at each jth iteration if ch founds
                }
            }

            // USED to handle the if max founds
            if(count>maxCount){
                maxCount = count;
                ans = ch;
            }else if(count == maxCount && ans > ch){
                ans = ch;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        String s = "testsample";

        System.out.println("Most frequent character = "+mostFrequent(s));
    }
} */

// Approach 2 (Sorting Approach) T.C. (O(n.logn))  S.C (O(n))

import java.util.Arrays;
public class mostFreqChar {

    public static char mostFrequent(String s){
        
        char[] arr = s.toCharArray();
        int n=arr.length;

        // 1) sort the array
        Arrays.sort(arr);

        int maxCount=-1;
        char ans = arr[0];

        int i=0, j=0;

        while(j<n){
            if(arr[i] == arr[j]){
                j++;
            }else{
                int count = j-i;
                if(count>maxCount) {
                    maxCount = count;
                    ans = arr[i];
                }
                i=j;
            }
        }

        // this is used to handle the last sequence of characters as after j>n the loop breaks these things are handled outside
        int count=j-i;
        if(maxCount<count){
            maxCount=count;
            ans=arr[i];
        }
   
        return ans;
    }

    public static void main(String[] args){
        String str = "character";    // aaccehrrt
        System.out.println("Most frequent character = "+mostFrequent(str));
    } 
}