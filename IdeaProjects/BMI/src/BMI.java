import java.util.Scanner;
public class BMI  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wat is je lengte (meter)? ");
        double length = scanner.nextDouble();
        System.out.println("Wat is je gewicht (kilo)? ");
        double weight = scanner.nextDouble();
        double bmi = weight/(length*length);

        System.out.println("Jouw BMI is " + bmi);
        if (bmi>25) {
            System.out.println("Je bent matig overwicht.");
            scanner.close();

        }
    }
}