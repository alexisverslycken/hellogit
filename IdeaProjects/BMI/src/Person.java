public class Person {
    String firstName;
    String lastName;

    void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.firstName = "Alexis";
        person1.lastName = "Verslycken";

        person1.printFullName();
    }
}