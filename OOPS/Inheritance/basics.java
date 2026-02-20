// In Java INHERITANCE is a very important comes under the OOPS concept
// The Inheritance is used to Inherit the properties of the Parent Class inside the child class 
// We use inheritance for the code reusability


// There are 5 types of Inheritance mainly supported by Java
// 1) Single Level Inheritance

/* class Animal{
    int legs = 4;
    String name = "Champa";
    String type = "Herbivorus";    // omni, carni, herbi 


    public void print(){
        System.out.println(this.legs+" "+this.name+" "+this.type);
    }
}

class Cow extends Animal{
    String breed = "Jersey";
    String food = "Grass";

    public void print(){
        System.out.println(this.name+" "+this.legs+" "+this.breed+" "+this.food+" "+this.type);
    }
}

public class basics{
    public static void main(String[] args){
        Cow c1 = new Cow();
        c1.print();
        System.out.println("Type = "+c1.type);

        Animal a1 = new Animal();
        a1.print();

        // System.out.println(a1.breed);  will give error
    }   
}  */


// 2) Multiple Inheritance

/* class GrandFather{
    int cars;
    String watches;

    public void print(int cars, String watches){
        this.cars = cars;
        this.watches = watches;
        System.out.println(this.cars+" "+this.watches);
    }
}

class Father extends GrandFather{
    int ev;
    int houses;

    public void print(int cars, String watches, int ev, int houses){
        this.cars = cars;
        this.watches = watches;
        this.ev = ev;
        this.houses = houses;
        System.out.println(this.cars+" "+this.watches+" "+this.ev+" "+this.houses);
    }
}

class Son extends Father{
    String bike;
    String mobile;

    public void print(int cars, String watches, int ev, int houses, String bike, String mobile){
        this.cars = cars;
        this.watches = watches;
        this.ev = ev;
        this.houses = houses;
        this.bike = bike;
        this.mobile = mobile;
        System.out.println(this.cars+" "+this.bike+" "+this.ev+" "+this.houses+" "+this.mobile+" "+this.watches);
    }
}

public class basics{
    public static void main(String[] args){
        GrandFather gf = new GrandFather();
        gf.print(5,"Rolex");

        Father f = new Father();
        f.print(6, "Patek Phillipe", 2, 4);

        Son s = new Son();
        s.print(8, "Richard Mille", 0, 7, "Samsung", "Harley Davidson Fat Boy");
    }
} */

// Heirarchical Inheritance

/* class Animal{
    void eat(){
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat meow");
    }
}

public class basics{
    public static void main(String[] args){
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.bark();
        Cat c = new Cat();
        c.meow();
    }
} */


// Package Example (bank.Account imported from bank folder's file)

/* import bank.Account;
class College{
    String name;
    int departments;

    void print(){
        System.out.println("College name is "+this.name+" & has "+this.departments+" departments");
    }
}

class Departments extends College {
    String name;
    String location;

    void print(){
        System.out.println("Department name is "+this.name+" & located at "+this.location);
    }
}
public class basics{
public static void main(String[] args){
    College c = new College();
    c.name = "RCOEM";
    c.departments = 10;

    Departments d = new Departments();
    d.name = "CSE";
    d.location = "Digital Tower";

    c.print();
    d.print();

    bank.Account b1 = new bank.Account();
    b1.accName = "Rishiraj";
    System.out.println(b1.accName);
}
} */

// Eg. Arithmetic Operations

import bank.addClass;

public class basics{
    public static void main(String[] args){
        addClass a1 = new addClass(4, 5);
        a1.print();
    }
}

