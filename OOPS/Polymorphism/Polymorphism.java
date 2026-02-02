package Polymorphism;
// The Polymorphism is a very important topic which has one name & many forms
// The polymorphism is a topic used in the OOPS concept where use can perfrom multiple operations using same method name under different classes

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("GRrrrrrrrrrrrr");
        }
    }

    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();

        d.speak();
        c.speak();
        l.speak();
    }
}
