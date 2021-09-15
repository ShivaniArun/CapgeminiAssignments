package Assignment5;

import java.util.HashSet;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Shivani", 100000,"engineer");
        Employee e2 = new Employee(102,"Simran", 100000,"engineer");
        Employee e3 = new Employee(103,"Utkarsh", 100000,"engineer");
        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        for(Employee e: set){
            e.displayDetails();
            System.out.println("............");
        }
    }
}
class Employee {
    private int id;
    private String name;
    private int salary;
    private String dept;

    public Employee(int id, String name, int salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    void displayDetails(){
        System.out.println("Id : " + this.getId());
        System.out.println("Name : " + this.getName());
        System.out.println("Salary : " + this.getSalary());
        System.out.println("Department : " + this.getDept());
    }
}