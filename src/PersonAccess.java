public class PersonAccess {
    public static void main(String[] args) {

        Person p1 = new Person("Sheldon Coper", "123-456-8967", 23);
        Person p2 = new Person();

        p2.setName("Joe Smith");
        p2.setSSN("123-4758-2299");
        p2.setAge(31);

        Person p3 = new Person();

        // we used the set method to access, the private fields
        p3.name = "Jason Lee";
        p3.setSSN("111-28-9837");
        p3.setAge(26);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println();
    }

}
