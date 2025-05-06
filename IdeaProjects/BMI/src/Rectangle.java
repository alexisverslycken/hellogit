public class Rectangle {
    int width;
    int length;
    int circumference;
    int surface;
}

class TwoRectangles {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.length = 5;
        rectangle1.width = 4;
        rectangle2.length = 3;
        rectangle2.width = 7;

        System.out.println("Rechthoek 1: Lengte = " + rectangle1.length + " met breedte = " + rectangle1.width);
        System.out.println("Rechthoek 2: Lengte = " + rectangle2.length + " met breedte = " + rectangle2.width);

        int area1 = rectangle1.length * rectangle1.width;
        int area2 = rectangle2.length * rectangle2.width;
        System.out.println("Oppervlakte van rechthoek 1: " + area1);
        System.out.println("Oppervlakte van rechthoek 2: " + area2);

        int perimeter1 = 2 * (rectangle1.length + rectangle1.width);
        int perimeter2 = 2 * (rectangle2.length + rectangle2.width);
        System.out.println("Omtrek van rechthoek 1: " + perimeter1);
        System.out.println("Omtrek van rechthoek 2: " + perimeter2);
    }
}

