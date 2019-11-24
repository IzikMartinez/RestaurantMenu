import Ingredients.*;

public class Hotdog extends MenuItem {

    Hotdog()
    {
        mainIngredient.add(
                new Ingredient(40*1.7, 3*1.7, 5*1.7, 0.5*1.7, "Wiener"));
        price = 2.35;
        name = "Hot Dog";
        validToppings.add(("Ketchup"));
        validToppings.add(("Mustard"));
        validToppings.add(("Cheese"));
        validToppings.add(("Chili"));
        validToppings.add("Relish");
    }

    @Override
    public void addTopping(String ingredientName) {
        switch (ingredientName) {
            case "Ketchup" -> toppings.add(new Ketchup());
            case "Mustard" -> toppings.add(new Mustard());
            case "Cheese" -> toppings.add(new Chesse());
            case "Chili" -> toppings.add(new Chili());
            case "Relish" -> toppings.add(new Relish());
        }
    }
}
