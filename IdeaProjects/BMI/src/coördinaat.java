import java.util.Scanner;

    public class coördinaat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geef X op");
            double x = scanner.nextDouble();

            System.out.println("Geef Y op");
            double y = scanner.nextDouble();

            if(x>0) {
                if (y>0) {
                    System.out.println("Het punt zit in kwadraat 1");
                }
                else if (y<0) {
                    System.out.println("Het punt zit in kwadraat 2");
                }
            }
            else if (x<0) {
                if (y>0) {
                    System.out.println("Het punt zit in kwadraat 3");
                }
                else if (y<0) {
                    System.out.println("Het kwadraat zit in kwadraat 4");
                }
            }
            scanner.close();
        }
}
