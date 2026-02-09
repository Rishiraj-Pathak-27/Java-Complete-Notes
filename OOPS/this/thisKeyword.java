////////////////////////////////////////
// this keyword example

public class thisKeyword{
    public static class Car{
        String name;  // null
        int price;    // 0
        double length;   // 0.0

        Car(String name, int price, double length){

            // if we write like this it will 2 times pass the same value provided in the object and will print the default values
            // name=name;
            // price=price;
            // length=length;

            // if we use "this" keyword it can have a recognizable name so it will pass the values once by the object and the second time will be printed
            // or we can use another name while initializing the constructors like. (String n, int p, double l)
            // if we write name=name then we are using the name of the constructors parameters only
            // if we write this.name=name then we are using the "name" from the previously initialized member
            // in short "this" keyword differentiate between instance variables and local variables when they have the same name.
            this.name=name;
            this.price=price;
            this.length=length;
        }

        Car(String name, int price){
            this(name, price,0.0);

        }

        Car(int p, String n, double l){
            price=p;
            name=n;
            length=l;
        }

        void print(){
            String name="bentley";  // even after we change the name but as we are using this keyword, 
                                     // while printing the name it is getting the access of the local datamembers from the Car class
            System.out.println(price+" "+this.name+" "+length);
        }
    }

    public static void main(String[] args){
        Car c1 = new Car("Defender",25000000,5.66);
        c1.print();
        Car c2 = new Car(3500000,"Inno va Hycross",4.65);
        c2.print();
    }
}