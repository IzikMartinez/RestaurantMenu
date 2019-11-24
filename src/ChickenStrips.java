import Ingredients.*;


public class ChickenStrips extends MenuItem{

    ChickenStrips() {

        // set main ingredient to chicken strips
        mainIngredient.setCalories(185);
        mainIngredient.setCarbohydrate(11);
        mainIngredient.setProtein(10);
        mainIngredient.setFat(11);
        mainIngredient.setName("Chicken Strips");
        price = 5.23;
        name = "Chicken Strips";
		//"4 strips";
    }	

    @Override
    public void addTopping(String ingredientName) {			//all possible toppings for chicken strips
        switch (ingredientName) {
            case "Lettuce" -> toppings.add(new Lettuce());	//add lettuce to burger
            case "Tomato" -> toppings.add(new Tomato());	//add tomato to burger
            case "Mustard" -> toppings.add(new Mustard());	//add mustard
			case "Mayonnaise" -> toppings.add(new Mayonnaise());	//mayonnaise
			case "Pickles" -> toppings.add(new Pickles());        	//pickles
			case "Nacho Cheese" -> toppings.add(new NachoCheese());	//nacho cheese
			case "Ketchup" -> toppings.add(new Ketchup());			//ketchup
			case "Chili" -> toppings.add(new Chili());				//chili
        }

    }
}
