import java.util.Scanner;
public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int som = 0;
        int average= 0;
        for(int i = 0; i < 10; i= i + 1) {
            System.out.println("Geef een getal op");
            number1 = scanner.nextInt();
            som = som + number1;
            average = som / 10;
        }
        scanner.close();
        System.out.println("De som is " + som);
        System.out.println("Het gemiddelde is " + average);
    }
}
