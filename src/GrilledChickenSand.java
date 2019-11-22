import Ingredients.*;


public class GrilledChickenSand extends MenuItem{

    GrilledChicken() {	
        mainIngredient = new ChickenGrill();		// set main ingredient to Chicken Grill
    }	

    @Override
    void addTopping(String ingredientName) {	//all possible ingredients for chicken sandwich
        switch (ingredientName) {
            case "Lettuce" -> toppings.add(new Lettuce());	//add lettuce to burger
			case "Ketchup" -> toppings.add(new Ketchup());	//ketchup
			case "Onion" -> toppings.add(new Yellow_Onion());	//onion
			case "Cheese" -> toppings.add(new Cheese());		//cheese
			case "Relish" -> toppings.add(new Relish());		//relish
			case "Chili" -> toppings.add(new Chili());			//chili
            case "Tomato" -> toppings.add(new Tomato());	//add tomato to burger
            case "Mustard" -> toppings.add(new Mustard());	//add mustard
			case "Mayonnaise" -> toppings.add(new Mayonnaise());	//mayonnaise
			case "Pickles" -> topping.add(new Pickles());        	//pickles
        }

    }
}
