package Employee_Management;

public class Employee_Main {
    public static void main(String[] args) {
        Manager A = new Manager(1234,"Lourd",50000,50);
        Developer B = new Developer (45898, 4000, "Rose", "IT");
        Tester C = new Tester (8983, 7978,"Peter", "Testing Tools");

       A.displayDetails();
       B.displayDetails();
       C.displayDetails();
    }
}
