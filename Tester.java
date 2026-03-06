package Employee_Management;

public class Tester extends Employee {
    private String testTools;
public Tester (int empId, double salary, String name,String testTools1) {
    super(empId, name, salary);
    this.testTools = testTools1;
}
    @Override
    public void displayDetails() {
        System.out.println("Employer ID " + super.empId + "\n Name is " + super.name + "\n Salary is " + super.salary);
    }
}
