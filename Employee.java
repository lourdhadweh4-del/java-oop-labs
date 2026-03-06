package Employee_Management;

class Employee {
    int empId;
    String name;
    double salary;

    public Employee(int empId1, String name1, double salary1) {
        this.empId = empId1;
        this.name = name1;
        this.salary = salary1;
    }
    void displayDetails() {
        System.out.println("Employment ID " + "\nName " + "\nSalary ");
    }

}
