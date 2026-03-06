/*
 * CSCI 185 M05 spring 2026
 * M1: Visibility Modifiers and Set/ Get Methods Lab(*SOLO*)
 * Lourd Hadweh
 * 2/3/2026
 *
 */
public class StudentAccess {

        public static void main(String[] args) {

            Student student1 = new Student("Peter", "982398", 3.5, 20);
            Student student2 = new Student();
            Student student3 = new Student("Luna", "928983", 3.2, 19);

            // manually filling info for default constructor
            System.out.println("Before modification: ");

            System.out.println(student1.toString());
            System.out.println(student2.toString());
            System.out.println(student3.toString());

            System.out.println("After modification: ");

            student2.setName("Rose");
            student2.setStu_id("290930");
            student2.setGpa(3.9);
            student2.setAge(22);

            student1.setGpa(3.7);
            student3.setAge(20);

            System.out.println("Printing student details: ");

            System.out.println(student1.toString());
            System.out.println(student2.toString());
            System.out.println(student3.toString());

//        System.out.println(student2.toString());
//        System.out.println(student3.toString());
//        System.out.println(Josh.toString());

        }
    }


