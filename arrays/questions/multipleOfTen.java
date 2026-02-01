import java.util.ArrayList;
public class multipleOfTen {
    public static ArrayList<Integer> multiple(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
    
        for(int ele : arr){
            if(ele%10==0){
                result.add(ele);
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {10,25,30,22,90,100};
        ArrayList<Integer> res = multiple(arr);
        System.out.println(res);
    }
}
