package Employee_Management;

public class Developer extends Employee {
    private String technology;

    public Developer(int empId, double salary, String name, String technology1) {
        super(empId, name, salary);
        this.technology = technology1;

    }
    @Override
    public void displayDetails() {

        System.out.println("Employer ID " + super.empId + "\n Name is " + super.name + "\n Salary is " + super.salary);

    }
}
