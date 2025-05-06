import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {

    static int x;
    static int y;
    static double groundNumber;
    static double exponent;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readInputNumbers();
        doSimpleCounts();
        doAdvancedCounts();

    }
    static int countSum(int x, int y) {
        int f = addExact(x, y);
        System.out.println("som: " + f);
        return f;
    }
    static int countSub(int x, int y) {
        int q = subtractExact(x,y);
        System.out.println("vermindering: " + q);
        return q;
    }
    static int countDiv(int x, int y) {
        int m = floorDiv(x,y);
        System.out.println("delen: " + m);
        return m;
    }
    static int countMultiply(int x, int y) {
        int n = multiplyExact(x,y);
        System.out.println("vermenigvuldigen: " + n);
        return n;
    }
    static double countSquareRoot1(int x) {
        double l = sqrt(x);
        System.out.println("als getal 1 een vierkantswortel is: " + l);
        return l;
    }
    static double countSquareRoot2(int y) {
        double k = sqrt(y);
        System.out.println("als getal 2 een vierkantswortel is: " + k);
        return k;
    }
    static double countPower(double groundNumber, double exponent) {
        double d = Math.pow(groundNumber, exponent);
        System.out.println("macht: " + d);
        return d;
    }
    static double countFraction(double groundNumber, double exponent) {
        double f = exponent/groundNumber;
        System.out.println("breuk: " + f);
        return f;
    }

    static void readInputNumbers() {
        System.out.println("Geef een getal op");
        x = scanner.nextInt();
        System.out.println("Geef opnieuw een getal op");
        y = scanner.nextInt();
        System.out.println("Geef het grondgetal op");
        groundNumber = scanner.nextDouble();
        System.out.println("Geef het exponent op");
        exponent = scanner.nextDouble();

    }
    static void doSimpleCounts() {
        int p = countSum(x,y);

        int q = countSub(x,y);

        int m = countDiv(x,y);

        int n = countMultiply(x,y);
    }
    static void doAdvancedCounts() {
        double l = countSquareRoot1(x);

        double k = countSquareRoot2(y);

        double d = countPower(groundNumber, exponent);

        double f = countFraction(groundNumber, exponent);
    }
}