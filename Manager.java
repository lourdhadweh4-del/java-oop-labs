package Employee_Management;

class Manager extends Employee {
    int teamSize;

    public Manager (int empId1, String name1, double salary1,int teamSize1) {
        super(empId1, name1, salary1);
        this.teamSize = teamSize1;

    }

    @Override
    public void displayDetails() {

        System.out.println("Employer ID " + super.empId + "\n Name is " + super.name + "\n Salary is " + super.salary);

    }
}
