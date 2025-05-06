import java.util.Scanner;

public class
ToThe3rdPower {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef het getal in dat je tot de derde macht wil berekenen: ");
        int number = scanner.nextInt();
        System.out.println(Math.pow(number, 3));
    }
}
