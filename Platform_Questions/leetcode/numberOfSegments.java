// 434. Number of Segments in a String

public class numberOfSegments{
    public static int segments(String s){
        int count=0;
        String[] arr = s.split(" ");

        for(String ele:arr){
            if(ele.length()!=0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String s = "Hello, my name is Rishiraj Pathak";
        System.out.println("Total Segments = "+segments(s));
    }
}