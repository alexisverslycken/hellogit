public class Car {
    String brand;
    public Car(String brand) {
        this.brand = brand;
    }

    public void printBrand() {
        System.out.println("Merk van de auto: " + brand);
    }
}

class CarPark {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo");

        car1.printBrand();
    }
}
