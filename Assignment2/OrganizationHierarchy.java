package Assignment2;

public class OrganizationHierarchy {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.salary();
        Employee e2 = new Manager();
        e2.salary();
        Employee e3 = new Labour();
        e3.salary();
    }
}
class Employee {
    void salary(){
        System.out.println("The average salary of employee is $1500");
    }
}
class Manager extends Employee{
    private int incentive;

    @Override
    void salary() {
        System.out.println("The total salary of Manager is $2000");
    }
}
class Labour extends Employee{
    private int overTime;

    @Override
    void salary() {
        System.out.println("The total salary of Labour is $1000");
    }
}