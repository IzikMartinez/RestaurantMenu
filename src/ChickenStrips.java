import Ingredients.*;


public class ChickenStrips extends MenuItem{

    ChickenStrips() {

        // set main ingredient to chicken strips
        mainIngredient.add(new Ingredient(185,11,11,10,"Chicken Strips"));
        price = 5.23;
        name = "Chicken Strips";

        validToppings.add("Ketchup");
        validToppings.add("Fry Sauce");
		//"4 strips";
    }	

    @Override
    public void addTopping(String ingredientName) {			//all possible toppings for chicken strips
        switch (ingredientName) {
			case "Fry Sauce" -> toppings.add(new FrySauce());	//mayonnaise
			case "Ketchup" -> toppings.add(new Ketchup());			//ketchup
        }

    }
}
