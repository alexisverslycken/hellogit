import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer de eerste hoek in: ");
        int angle1 = scanner.nextInt();
        System.out.print("Voer de tweede hoek in: ");
        int angle2 = scanner.nextInt();
        System.out.print("Voer de derde hoek in: ");
        int angle3 = scanner.nextInt();
        scanner.close();
    }
}

