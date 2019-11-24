import Ingredients.*;

public class Fries extends MenuItem {

    Fries()
    {
        mainIngredient.add(
            new Ingredient(365, 48, 4, 17, "Fries"));
        //"4.1 oz";
        price  = 2.55;
        name = "Fries";
        validToppings.add("Fry Sauce");
        validToppings.add("Ketchup");
    }

    @Override
    public void addTopping(String ingredientName) {
        switch (ingredientName) {
            case "Ketchup" -> toppings.add(new Ketchup());
            case "Fry Sauce" -> toppings.add(new FrySauce());
        }
    }
}
