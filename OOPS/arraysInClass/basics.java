// we can use the array in the class in many forms by specifying its size in constructor of by passing itself in constructor

/* import java.util.Arrays;
public class basics {
public static class Student{
    String name;
    int age;
    int[] marks;

    // constructor 1 which is initialized with size only
    Student(int s){
        marks = new int[s];
    }

    // constructor 2 which is initialized with the complete array
    Student(int[] m){
        marks=Arrays.copyOf(m,m.length);
    }

    // method to print array elements
    void print(){
        for(int ele:marks){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}   

public static void main(String[] args){
    // obj 1 to provide size as an arguement & pass the values one by one usig objName 
    Student s1 = new Student(5);
    s1.marks[0] = 78;
    s1.marks[1] = 90;
    s1.marks[2] = 100;
    s1.marks[3] = 56;
    s1.marks[4] = 88;
    s1.print();

    // obj 2 in which the complete array is passed as an arguement 
    int[] arr = {78,90,100,56,88};
    Student s2 = new Student(arr);
    s2.marks[0] = 28;   // it can change the value from that deep copy but cannot from the original array 

    System.out.println(arr[0]);

    }
} */

/////////////////////////////////////////
// this keyword example

public class basics{
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