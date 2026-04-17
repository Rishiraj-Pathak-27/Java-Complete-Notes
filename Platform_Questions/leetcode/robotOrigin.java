// 657. Robot Return to Origin

public class robotOrigin {
    public static boolean roboOrigin(String s){
        char[] arr = s.toCharArray();

        int x=0, y=0;

        for(char ele:arr){
            if(ele=='R') x++;
            else if(ele=='L') x--;
            else if(ele=='U') y++;
            else if(ele=='D') y--;
        }

        if(x==0 && y==0) return true;
        return false;
    }

    public static void main(String[] args){
        String s = "RRUULLDD";
        System.out.println(roboOrigin(s));
    }
}
