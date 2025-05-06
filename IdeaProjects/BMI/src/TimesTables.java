import java.util.Scanner;

public class TimesTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een geheel getal in: ");
        int number = scanner.nextInt();
        int endNumber = 10;
        for (int i = 0; i <= endNumber; i = i + 1) {
            int multiplication = number * i;
            System.out.println(number + " * " + i + " = " + multiplication);
        }
        scanner.close();
    }
}
