import java.util.Scanner;

public class monthCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer het rangnummer van de maand in (1-12): ");
        int month = scanner.nextInt();
        int days = 0;

        if (month == 1) {
            days = 31;
        }
        else if (month == 2) {
            days = 28;
        }
        else if (month == 3) {
            days = 31;
        }
        else if (month == 4) {
            days = 30;
        }
        else if (month == 5) {
            days = 31;
        }
        else if (month == 6) {
            days = 30;
        }
        else if (month == 7) {
            days = 31;
        }
        else if (month == 8) {
            days = 31;
        }
        else if (month == 9) {
            days = 30;
        }
        else if (month == 10) {
            days = 31;
        }
        else if (month == 11) {
            days = 30;
        }
        else if (month == 12) {
            days = 31;
        }
        else {
            System.out.println("Ongeldig rangnummer");
        }

        if (days > 0) {
            System.out.println("De maand " + month + " heeft " + days + " dagen.");
        }

        scanner.close();
    }
}
