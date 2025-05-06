import java.util.Scanner;

public class Greeter {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is uw naam?");
        String name = scanner.next();
        System.out.println("hallo " + name);
    }
}