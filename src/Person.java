/*
 * CSCI 185 M05 spring 2026
 * M1: Visibility Modifiers and Set/ Get Methods, constructors(fully loaded, default, and copy constructors), toString method,
 * immutable class, this keyword, Abstraction, and Encapsulation.
 * lesson #4
 * Lourd Hadweh
 * 2/5/2026
 *
 */
public class Person {

    // instance variables
    String name;
    private String SSN;
    private int age;

    // fully loaded constructor
    public Person(String n, String SSN, int a) {

        // Constructor parameters (n, SSN, a) receive values when the object is created.
        // "this" refers to the current object's instance variables.
        // The assignment copies the values from the parameters into the object's fields.
        //
        // Flow of data:
        // parameter value --> instance variable

        this.name = n;
        this.SSN = SSN;
        this.age = a;
    }


    // no-arg constructor we don't have to define a body
    public Person() {

    }

    // Copy constructor
    public Person(Person p) {

        // Receive a copy of a Person object from outside the class
        // First, check if the provided object is valid

        if (p == null) {
            System.out.println("Invalid object. Stop here!");
            System.exit(1);
        }

        // Once we confirm that the object is valid,
        // copy each field from the provided object into this new object
        this.name = p.name;
        this.age = p.age;
        this.SSN = p.SSN;
    }



    // set and get methods (also known as mutators and accessors)
    // need to define another name inside the constructor of set method

    public void setName(String n1) {
        this.name = n1;
    }

    public String getName() {
       return this.name;

    }

    public void setSSN(String s1) {
        this.SSN = s1;
    }

    public String getSSN() {
        return this.SSN;

    }

    public void setAge(int a1) {
        this.age = a1;
    }

    public int getAge() {
        return this.age;

    }

    public String toString() {

        // shortcut version of toString method
        return "Name: " + this.name + "\nSSN " + this.SSN + "\nAge: " + this.age;

        // Another way to build a String:
//
// String s = "";
// s = "Name: " + this.name + "\n"
//   + "SSN: " + this.SSN + "\n"
//   + "Age: " + this.age;
//
// Notes:
// 1. "\n" creates a new line in the output.
// 2. "this.name", "this.SSN", and "this.age" refer to the object's instance variables.
// 3. String concatenation uses the + operator.
// 4. This approach builds the string step-by-step and stores it in variable "s".

    }

}

// ===============================
// IMMUTABLE CLASS
// ===============================
// An immutable class is a class whose objects cannot be changed after creation.
//
// Rules to make a class immutable:
// 1. Declare the class as final (so it cannot be extended).
// 2. Make all data fields private and final.
// 3. Do NOT provide setter methods.
// 4. Provide getter methods only if read access is needed.
// 5. Initialize all fields using a constructor.
// 6. If the class contains mutable objects, return copies instead of original references.


// ===============================
// "this" KEYWORD IN JAVA
// ===============================
// The "this" keyword refers to the current object.
//
// Uses of "this":
// 1. To refer to the current object's instance variables.
//    Useful when parameter names are the same as field names.
//
//    Example:
//    void setI(int i){
//        this.i = i;   // "this.i" refers to the instance variable
//    }
//
// 2. To call another constructor from the same class (constructor overloading).
//    This must be the first statement inside the constructor.
//
//    Example:
//    public MyClass(){
//        this(0);   // Calls another constructor
//    }


// ===============================
// ABSTRACTION
// ===============================
// Abstraction means hiding implementation details and showing only essential features.
// It focuses on WHAT an object does rather than HOW it does it.
//
// Abstraction can be achieved using:
// - Abstract classes
// - Interfaces


// ===============================
// ENCAPSULATION
// ===============================
// Encapsulation means wrapping data and methods together inside a class
// and restricting direct access to the data.
//
// This is achieved by:
// 1. Making variables private.
// 2. Providing controlled access using public methods (getters/setters).
//
// Benefits:
// - Protects data from unauthorized access.
// - Improves code maintainability.
// - Makes code easier to modify and debug.
