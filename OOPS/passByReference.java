// the same shallow copy of the user defined class object is copied and passed as the parameter to the method

public class passByReference {
    public static class Car{
        String name;
        int length;
        double engineCapacity;           // attributes or members
        int torque; 

        // method used to print this statement and accessed in the main method
        void print(){
            System.out.println(name+" "+length+"m "+engineCapacity+"l "+torque+"nm ");
        }
    }

    public static void main(String[] args){
        Car c = new Car();

        c.name = "Defender";
        c.length = 6;
        c.engineCapacity = 5.5;
        c.torque = 800;

        // original torque value = 800 + original engineCapacity value = 5.5
        c.print();
       
        change(c);       // we called change function in which torque value changed to 750
        change(c);      // we called change function in which engineCapacity value changed to 5

        // we see the torque value as 750 after calling the method + engineCapacity value as 5 after calling the method
        c.print();
        
    }

    public static void change(Car x){
        x.torque = 750;     // we changed the torque value here to 750
        x.engineCapacity = 5;  // we changed the engineCapacity value here to 5
    }
}
