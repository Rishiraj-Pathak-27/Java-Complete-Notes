
import java.util.Scanner;


class Main{
    public static boolean invalidCase(String[] veh, int[] hrs){
        
        for(int i=0; i<veh.length; i++){
            if(veh[i].contains(" ") || hrs[i]<0){
                return true;
            }
        }
        return false;
    }

    public static int helper(int[] hrs){
        int count=0;

        for(int i=0; i<hrs.length; i++){
            if(hrs[i]>=5){
                count++;
            }
        }
        return count;
    } 

} 

public class parkingLot{


    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter total cars: ");
        int n=ip.nextInt();
        ip.nextLine();
        String[] veh = new String[n];
        int[] hrs = new int[n];

        for(int i=0; i<n; i++){
            System.out.printf("[%d]Enter Vehicle number: ",i);
            veh[i] = ip.nextLine();

            System.out.printf("[%d]Enter hrs: ",i);
            hrs[i] = ip.nextInt();
            ip.nextLine();
        }

        Main m = new Main();

        if(m.invalidCase(veh,hrs)){
            System.out.println("Invalid Input");
            return;
        }else{
            for(int i=0; i<n; i++){
            System.out.printf("%s %d\n",veh[i],hrs[i]);
        }
            System.out.println(m.helper(hrs));
        }
    }
}