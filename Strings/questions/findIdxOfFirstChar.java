// 28. Find the Index of the First Occurrence in a String

public class findIdxOfFirstChar {

    public static int strStr(String a, String b){

        boolean cond = a.contains(b);

        if(cond){
            return a.indexOf(b);
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        String a="mississippi";
        String b="issippi";
        System.out.println(strStr(a,b));
    }
}
