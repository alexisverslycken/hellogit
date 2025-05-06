import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voor hoeveel getallen wordt de som berekent?");
        int endNumber = scanner.nextInt();

        scanner.close();
        int som = 0;
        for(int i = 0; i <= endNumber; i= i + 1) {
            System.out.println(i);
            som = som + i;
        }
        System.out.println("De som van deze getallen is " + som);
    }
}
