import Ingredients.*;

public class Hotdog extends MenuItem {

    Hotdog()
    {
        mainIngredient = new Weiner();
        price = 2.35;
    }

    @Override
    void addTopping(String ingredientName) {
        switch (ingredientName) {
            case "Ketchup" -> toppings.add(new Ketchup());
            case "Mustard" -> toppings.add(new Mustard());
            case "Cheese" -> toppings.add(new Chesse());
            case "Chili" -> toppings.add(new Chili());
            case "Onion" -> toppings.add(new Yellow_Onion());
        }
    }
}
