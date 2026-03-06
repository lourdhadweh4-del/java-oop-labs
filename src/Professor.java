/*
 * CSCI 185 M05 spring 2026
 * M1: toString and Copy Constructor Lab (*SOLO*)
 * Lourd Hadweh
 * 2/5/2026
 *
 */
public class Professor {

    private String name;
    private String department;
    private double annual_salary;
    private int year_in_profession;

    public Professor(String n, String d, double s, int y) {
        this.name = n;
        this.department = d;
        this.annual_salary = s;
        this.year_in_profession = y;
    }

    // Copy constructor
    public Professor(Professor a) {
        if(a == null) {
            System.out.println("Invalid Object A ");
        }

        this.name = a.name;
        this.department = a.department;
        this.annual_salary = a.annual_salary;
        this.year_in_profession = a.year_in_profession;

    }

    // toString method
    public String toString() {
        return "Name: " + this.name + "\nDepartment: " + this.department + "\nAnnual Salary: " +  this.annual_salary +
                "\nYear in Profession: " +  this.year_in_profession;
    }

    public void setName(String n) {

        this.name = n;
    }
    public String getName() {
        return this.name;
    }

    public void setDepartment(String d) {

        this.department = d;
    }

    public String getDepartment() {

        return this.department;
    }

    public void setAnnual_salary(double s) {

        this.annual_salary = s;
    }

    public double getAnnual_salary() {

        return annual_salary;
    }

    public void setYear_in_profession(int y) {

        this.year_in_profession = y;
    }

    public int getYear_in_profession() {

        return year_in_profession;
    }
}
