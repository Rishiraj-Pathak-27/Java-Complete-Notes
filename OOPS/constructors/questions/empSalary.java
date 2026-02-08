// Create a class Employee
// name, salary
// Constructor
// If salary < 0 → set to 0

public class empSalary{
    public static class Employee{
        String name;
        double salary;

        Employee(String n, double s){
            name=n;
            salary=s;
        } 

        double getSalary(){
            if(salary<0){
                salary=0;
            }
            return salary;
        }
    }

    public static void main(String[] args){
        Employee e = new Employee("Rishiraj",900000);
        System.out.println("Salary of employee "+e.name+" "+e.getSalary());
    }
}