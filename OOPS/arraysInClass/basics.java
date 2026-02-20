// we can use the array in the class in many forms by specifying its size in constructor of by passing itself in constructor

import java.util.Arrays;
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
    Student(int[] marks){
        this.marks=Arrays.copyOf(marks,marks.length);
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
} 