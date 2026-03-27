public class removeDuplicateChar{
    public static void removeDuplicates(String str){
        int n=str.length();
        String res = "";

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);

            if(res.indexOf(ch) == -1){
                res += ch;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args){
        String str = "programming";

        removeDuplicates(str);
    }
}