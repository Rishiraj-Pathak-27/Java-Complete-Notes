public class replaceVowelsByAsterisk {

    public static String replaceVowels(String str){
        int n=str.length();

        String s = "";

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                s += '*';
            }else{
                s += ch;
            }
        }
        return s;
    }

    public static void main(String[] args){
        String str = "rishiraj";

        System.out.println(replaceVowels(str));
    }
}
