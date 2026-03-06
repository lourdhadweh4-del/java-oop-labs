public class ProfessorAccess {
    public static void main(String[] args) {

        // name , department, salary , year
        Professor P1 = new Professor("Clara", "Math", 5500, 11 );
        Professor P2 = new Professor("Sami", "Programming", 7600, 20);
        Professor P3 = new Professor(P2);

        // printing before modification
        // for get methods
        System.out.println("Printing before modification ");

        System.out.println(P1.toString());
        System.out.println(P2.toString());
        System.out.println(P3.toString());

        // printing after modification
        System.out.println("Printing after modification");

        // set method to modify data
        P1.setDepartment("Physics");
        P1.setYear_in_profession(12);
        P2.setAnnual_salary(9500);
        P2.setYear_in_profession(25);

        System.out.println(P1.toString());
        System.out.println(P2.toString());

    }
}
