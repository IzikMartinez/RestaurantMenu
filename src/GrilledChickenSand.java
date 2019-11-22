import Ingredients.*;


public class GrilledChickenSand extends MenuItem{

    GrilledChicken() {
        mainIngredient = new ChickenGrill();
    }

    @Override
    void addTopping(String ingredientName) {
        switch (ingredientName) {
            case "Lettuce" -> toppings.add(new Lettuce());
            case "Tomato" -> toppings.add(new Tomato());
            case "Mustard" -> toppings.add(new Mustard());
			case "Mayonnaise" -> toppings.add(new Mayonnaise());
			case "Pickles" -> topping.add(new Pickles());        
        }
		//Lettuce
		//Tomato
		//Mustard
		//Mayonnaise
		//
    }
}
