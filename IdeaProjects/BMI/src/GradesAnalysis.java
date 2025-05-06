import java.util.Scanner;

public class GradesAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Op hoeveel punten op 100 wilt u ingeven?");
        int classes = scanner.nextInt();
        double grade = 0;
        double average = 0;
        for (int i = 1; i <= classes; i = i + 1) {
            System.out.println("Geef cijfer " + i + " op:");
            grade = scanner.nextDouble();
            if (grade < 50) {
                System.out.println("Niet Geslaagd");
            } else if (grade >= 50) {
                System.out.println("Geslaagd");
            }
            average = ((grade + grade) * classes) / classes;
        }
        System.out.println("Je gemiddelde score is " + average);
        if(average<50) {
            System.out.println("Je gemiddelde score is lager dan vijftig");
            System.out.println("Eindresultaat: niet geslaagd");
        }
        else if(average>50) {
            System.out.println("Je gemiddelde score is hoger of gelijk aan vijftig");
            System.out.println("Eindresultaat: geslaagd");
        }
    }
}
