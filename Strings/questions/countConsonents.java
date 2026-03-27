// WAP to count consonents from the string

public class countConsonents {
    public static void main(String[] args){
        String str = "rishiraj";
        int count=0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')){
                count++;
            }
        }
        System.out.println("Consonents in string are = "+count);
    }
}
