public class Animal {
    String name;
    int numberOfLegs;
    String color;
    boolean fly;

}

class Zoo {
    public static void main(String[] args){
        Animal zebra = new Animal();
        zebra.fly = true;
        zebra.numberOfLegs = 4;
        zebra.color= "orange";
        zebra.name = "ZeldaTheZebra";
        Animal dragon = new Animal();
        dragon.fly = true;
        dragon.name = "Pigglet";
        dragon.numberOfLegs = 10;
        dragon.color = "black";
        Animal unicorn = new Animal();
        unicorn.fly = true;
        unicorn.name = "Kuro";
        unicorn.numberOfLegs = 4;
        unicorn.color = "As black as a well on a night with no moon";

    }
}
