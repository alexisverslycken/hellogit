import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een geheel getal in");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i = i + 1) {
            for (int j = 1; j <= i; j=j+1) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

