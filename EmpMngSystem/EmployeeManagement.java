package EmpMngSystem;

import java.util.ArrayList;

class Employee {
    // Declaring instance variables
    private int id;
    private String name;
    private int salary;

    // Creating a parameterized constructor for Employee class
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // creating a method to display the details of the employee
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(1, "Nikhil", 10000);
        Employee emp2 = new Employee(2, "Yash", 20000);
        Employee emp3 = new Employee(3, "Isha", 30000);

        // Storing Employees in a List using an ArrayList
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Displaying Employee Details using for-each loop
        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
