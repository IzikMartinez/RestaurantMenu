import Ingredients.*;
//This is a menu food option the customer can add to their order.
public class Fries extends MenuItem {

    Fries()
    {
        mainIngredient = new Potato();
        price  = 2.55;
    }

    @Override
    void addTopping(String ingredientName) {
        switch (ingredientName) {
            //Various toppings customers can add to their fries
            case "Ketchup" -> toppings.add(new Ketchup());
            case "Mustard" -> toppings.add(new Mustard());
            case "Chili" -> toppings.add(new Chili());
        }
    }
}
