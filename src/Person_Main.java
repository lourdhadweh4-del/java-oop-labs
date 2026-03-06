public class Person_Main {

    public static void main(String[] args) {
        Person p1 = new Person("Sheldon Coper", "123-456-8967", 23);
        Person p2 = new Person();

        p2.setName("Joe Smith");
        p2.setSSN("123-4758-2299");
        p2.setAge(31);


        System.out.println(p1.toString());
        System.out.println(p2.toString());


    }
}
