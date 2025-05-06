public class Recipe {
    String name;
    int timeNeeded;
    String type;
    boolean isVegetarian;
}

class RecipeApp {
    public static void main(String[] args) {
        Recipe iceCream = new Recipe();

        iceCream.name = "roomijs";
        iceCream.timeNeeded = 75;
        iceCream.type = "dessert";
        iceCream.isVegetarian = true;

        System.out.println("Naam van het gerecht: " + iceCream.name);
        System.out.println("Tijd: " + iceCream.timeNeeded);
        System.out.println("Type gerecht: " + iceCream.type);
        if (iceCream.isVegetarian == true) System.out.println("Vegetarisch? Ja");
        else if (iceCream.isVegetarian == false) System.out.println("Vegetarisch? Nee");
    }
}