import java.util.Scanner;

public class CompetitionDecider {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wat zijn jouw punten voor wiskunde op 100");
        double math = scanner.nextDouble();

        System.out.println("Wat zijn jouw punten voor fysica op 100");
        double physics = scanner.nextDouble();

        System.out.println("Wat zijn jouw punten voor chemie op 100");
        double chemistry = scanner.nextDouble();

        double total = math + physics + chemistry;

        if(math<65) {
            System.out.println("U mag niet meedoen aan deze wedstrijd");
        }

        else if(physics<55) {
            System.out.println("U mag niet meedoen aan deze wedstrijd");
        }

        else if(chemistry<50) {
            System.out.println("U mag niet meedoen aan deze wedstrijd");
        }

        else if(total<190) {
            System.out.println("U mag niet meedoen aan deze wedstrijd");
        }
        else {
            System.out.println("U mag meedoen aan deze wedstrijd");
        }
        scanner.close();
    }
}
