// Create a class Employee
// private variables: name, salary
// Salary should not be negative
// Create getter and setter methods
// Print employee details

class Employee{
    private String name;
    private double salary;

    public void setSalary(double s){
        if(s>0){
            salary=s;
        }
    } 

    public void setName(String n){
        name=n;
    }

    public double getSalary(){
        return salary;
    }
    
    public String getName(){
        return name;
    }
}

    public class getterSetter{
        public static void main(String[] args){
            Employee e = new Employee();
            e.setSalary(150000);
            e.setName("Rishiraj");

            System.out.println("Name of emp is "+e.getName()+" & salary of emp is "+e.getSalary());
        }
    }