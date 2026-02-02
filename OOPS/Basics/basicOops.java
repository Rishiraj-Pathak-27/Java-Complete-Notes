package Basics;
// In oops, the main 2 pillars are classes & objects
// The classes are the userdefined datatype also known as the blueprint of an object
// EG.

import java.util.Scanner;

public class basicOops { 

public static class Student{

    String name;
    int rollno;
    double cgpa;     // declaration of all the variables of different types in a single user defined datatype i.e class
    char grade;

    void print(){
        System.out.println(name+" "+rollno+" "+cgpa+" "+grade+" ");
    }
    
}   


// defining user defined class 
 
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);    // here 'Scanner' is also a class while the 'ip' is an object
        Student s = new Student();     // object created to access the class
        s.name = ip.nextLine();
        s.rollno = ip.nextInt();
        s.cgpa = ip.nextDouble();          // initialization of the variables of different types
        s.grade = ip.next().charAt(0);
        ip.nextLine();

        Student s2 = new Student();
        s2.name = ip.nextLine();
        s2.rollno = ip.nextInt();
        s2.cgpa = ip.nextDouble();          // initialization of the variables of different types
        s2.grade = ip.next().charAt(0);

        // if we create the print() in class itself then we call print() using dot operator
        s.print();
        s2.print();

        // if we create the print() outside the class then we should call print(agr1,--n) through arguments
        // print(s);
        // print(s2);

    }

    
}

