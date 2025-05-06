import java.util.Scanner;

public class Temperature {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wat is de temperatuur?");
        double temperature = scanner.nextDouble();

        if (temperature<0) {
            System.out.println("Freezing weather");
        }
        else if (temperature<10) {
            System.out.println("Very cold weather");
        }
        else if (temperature<20) {
            System.out.println("Cold weather");
        }
        else if (temperature<30) {
            System.out.println("Normal temperature");
        }
        else if (temperature<40) {
            System.out.println("Its hot");
        }
        else {
            System.out.println("Its very hot");
        }
        scanner.close();
    }
}
