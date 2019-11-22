import Ingredients.*;

public class Fries extends MenuItem {

    Fries() { mainIngredient = new Potato(); }

    @Override
    void addTopping(String ingredientName) {
        switch (ingredientName) {
            case "Ketchup" -> toppings.add(new Ketchup());
            case "Mustard" -> toppings.add(new Mustard());
        }
    }
}
