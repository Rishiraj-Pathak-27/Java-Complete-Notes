// In Java, an abstract class or method is an incomplete entity which is used by the subclass to execute that particular class
// Properties of Abstract Class:-
// 1) It should be declared with abstract keyword
// 2) An abstract class should contain abstract method or non-abstract method
// 3) We cannot create an object of an abstract class
// 4) We can execute an abstract class by either creating constructor of it, or by creating a non-abstract method in it

// Eg.

/* abstract class Department{
    abstract void deptName();
}

class Staff extends Department{
    public void deptName(){
        System.out.println("Staff belongs to CSE Department");
    }
}

class Students extends Department{
    public void deptName(){
        System.out.println("Student studies in CSE Department");
    }
}

public class absBasics{
    public static void main(String[] args){
        // Department d = new Department();    // we cannot instantiate this class because it is an abstract class
        // d.deptName();
        Staff staff = new Staff();
        staff.deptName();
        Students stu = new Students();
        stu.deptName ();
    }
} */

// Eg. Calling abstract class using non-abs method and constructor

/* abstract class Department{
    Department(){
        System.out.println("Department provides salary to Staff");
    }
    abstract void deptName();

    public void name(){
        System.out.println("Department name is CSE");
    }
}

class Staff extends Department{
    Staff(){
        System.out.println("Staff receives salary from department every month");
    }
    public void deptName(){
        System.out.println("Staff teaches in CSE Department");
    }
}

class Students extends Department{
    public void deptName(){
        System.out.println("Students studies in CSE Department");
    }
}

public class absBasics{
    public static void main(String[] args){
        // Staff s1 = new Staff();
        // s1.name();            // called abstract class method through a non-abstract method
        // s1.deptName();

        // Students s2 = new Students();
        // s2.deptName();

        Staff s = new Staff();     // called abstract class through constructor using inherited properties of the department class
                                   // In Java this method is called as constructor chaining
        s.deptName();
    }
} */

// Eg. calling the childest class of the Department to print details from all the classes 

abstract class Department{
    Department(){
        System.out.println("Department provides salary to Staff");
    }
    abstract void deptName();

}

class Staff extends Department{

    Staff(){
        System.out.println("gets salary through department");
    }

    @Override
    public void deptName(){
        System.out.println("Staff teaches in CSE Department");
    }

}

class Students extends Department{
    Students(){
        System.out.println("Student studies in CSE department");
    }
    
    @Override
    public void deptName(){
        System.out.println("Students studies in CSE Department");
    }
}

public class absBasics{
    public static void main(String[] args){
        Students s1 = new Students();
    }
}