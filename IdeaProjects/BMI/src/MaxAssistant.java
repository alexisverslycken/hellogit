import java.util.Scanner;

public class MaxAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer het eerste getal in: ");
        double number1 = scanner.nextDouble();
        System.out.print("Voer het tweede getal in: ");
        double number2 = scanner.nextDouble();
        System.out.print("Voer het derde getal in: ");
        double number3 = scanner.nextDouble();
        double maximum = number1;

        if (number2 > maximum) {
            maximum = number2;
        }
        if (number3 > maximum) {
            maximum = number3;
            System.out.println(maximum + " is het maximum");
        }
        else {
            System.out.println(maximum + " is het maximum");
        }
        scanner.close();
    }
}
