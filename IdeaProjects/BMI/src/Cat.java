public class Cat {
    String name;
    int age;
    String color;
    boolean tricks;
}
class CatHouse {
    public static void main(String[] args){
        Cat meowkers = new Cat();
        meowkers.name = "Whiskers";
        meowkers.age = 5;
        meowkers.color = "valentine pink";
        meowkers.tricks = true;

        Cat kitten = new Cat();
        kitten.name = "Paws";
        kitten.age = 1;
        kitten.color = "valentine pink";
        kitten.tricks = false;

        Cat elder = new Cat();
        elder.name = "Claws";
        elder.age = 1005;
        elder.color = "Reseda green";
        elder.tricks = true;

        Cat skeleton = new Cat();
        skeleton.name = "Tail";
        skeleton.age = 9;
        skeleton.color = "Rosewood";
        skeleton.tricks = false;

        System.out.println("Name: " + meowkers.name);
        System.out.println("Age: " + meowkers.age);
        System.out.println("Color: " + meowkers.color);
        if (meowkers.tricks == true) System.out.println("It can roll over");
        else if (meowkers.tricks == false) System.out.println("It can't do tricks");
        System.out.println(" ");
        System.out.println("Name: " + kitten.name);
        System.out.println("Age: " + kitten.age);
        System.out.println("Color: " + kitten.color);
        if (kitten.tricks == true) System.out.println("It can shoot fireballs");
        else if (kitten.tricks == false) System.out.println("It can't do tricks");
        System.out.println(" ");
        System.out.println("Name: " + elder.name);
        System.out.println("Age: " + elder.age);
        System.out.println("Color: " + elder.color);
        if (elder.tricks == true) System.out.println("It can sing 'Friday I'm in love' by The Cure");
        else if (elder.tricks == false) System.out.println("It can't do tricks");
        System.out.println(" ");
        System.out.println("Name: " + skeleton.name);
        System.out.println("Age: " + skeleton.age);
        System.out.println("Color: " + skeleton.color);
        if (skeleton.tricks == true) System.out.println("It can play dead");
        else if (skeleton.tricks == false) System.out.println("It can't do tricks");
        System.out.println(" ");
    }
}
