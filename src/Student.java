/*
* CSCI 185 M05 spring 2026
* M1: Visibility Modifiers and Set/ Get Methods Lab(*SOLO*)
* Lourd Hadweh
* 2/3/2026
*
 */
public class Student {

    private String name;
    private String stu_id;
    private double GPA;
    private int age;

    public Student (String n, String s, double G, int a) {

        this.name = n;
        this.stu_id = s;
        this.GPA = G;
        this.age = a;
    }

    public Student() {


    }

    public String toString() {
        String a = " ";
        a = "Student Name: " + this.name + "\n" +"Student Student ID: " + this.stu_id + "\n"+  "Student GPA: " + this.GPA + "\n" + "Student Age: " + this.age+ "\n";
        return a;

    }

    public String getName() {

        return this.name;
    }

    public void setName(String n) {

        this.name = n;
    }

    public String getStu_id() {

        return this.stu_id;
    }

    public void setStu_id(String s) {

        this.stu_id= s;
    }

    public double getGpa() {

        return this.GPA;
    }

    public void setGpa(double G) {

        this.GPA = G;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int a) {

        this.age = a;
    }
}


// Notes:
// toString method
// 1st we built a string
// then we add stuff to this string
//    public String toString() {
//        String s = "";
//
//        s += "Capital: " + this.capital + "\n";
//
//        return s;

// main method
// System.out.println(Josh.toString());