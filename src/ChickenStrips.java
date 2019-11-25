/**
 * <h1>ChickenStips</h1>
 * ChickenStrips is a item on the menu, extends the MenuItem class
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
import Ingredients.*;


public class ChickenStrips extends MenuItem{

    ChickenStrips() {

        // set main ingredient to chicken strips, set price and name
        mainIngredient.add(new Ingredient(185,11,11,10,"Chicken Strips"));
        price = 5.23;
        name = "Chicken Strips";

        //valid toppings of chicken strips
        validToppings.add("Ketchup");
        validToppings.add("Fry Sauce");
		//"4 strips";
    }

    /**
     * addTopping adds toppings to the menuitem based on user choice
     * @param ingredientName
     */
    @Override
    public void addTopping(String ingredientName) {			//all possible toppings for chicken strips
        switch (ingredientName) {
			case "Fry Sauce" -> toppings.add(new FrySauce());	//mayonnaise
			case "Ketchup" -> toppings.add(new Ketchup());			//ketchup
        }

    }
}
