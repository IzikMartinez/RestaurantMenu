/**
 * <h1>Drink</h1>
 * The Drink class is a menu item, extends menu item
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
import Ingredients.Ingredient;

public class Drink extends MenuItem{
    Drink() {
        //Sets nutritional value
        mainIngredient.add(new Ingredient(0,0,0,0,"Default"));
        //Sets medium drink to default drink
        toppings.add(new Ingredient(430,116,0,0,"Medium Drink"));

        name = "Drink";
        //Drink can be small, med. or lg
        validToppings.add("Small");
        validToppings.add("Medium");
        validToppings.add("Large");

    }

    /**
     * addTopping adds toppings to menu item depending on the case
     * @param ingredientName
     */
    @Override
    public void addTopping(String ingredientName) {
        switch (ingredientName) {
            case "Small" -> {
                toppings.remove(0);
                toppings.add(new Ingredient(270, 73, 0, 0, "Small Drink"));
                price = 0.59;
            }
            case "Medium" -> {
                toppings.remove(0);
                toppings.add(new Ingredient(430, 116, 0, 0, "Medium Drink"));
                price = 0.89;
            }
            case "Large" -> {
                toppings.remove(0);
                toppings.add(new Ingredient(590, 160, 0, 0, "Large Drink"));
                price = 1.20;
            }
        }

    }
}
