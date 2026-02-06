// Create a class Car with:
// Variables: brand, speed
// Method: drive() → prints "Car is moving"
// Create 2 objects and print their details.

public class basicClass {
    public static class Car{
        String brand;
        int topSpeed;

        void drive(){
            System.out.println("Car is Moving");
        }

        void print(){
            System.out.println("Car is of brand "+brand+" & has a top speed of "+topSpeed+"kmph");
        }
    }

    public static void main(String[] args){
        Car c1=new Car();
        c1.brand = "BMW";
        c1.topSpeed = 300;

        Car c2=new Car();
        c2.brand = "Ranger Rover";
        c2.topSpeed = 280;

        c1.print();
        c2.print();
    }
}
