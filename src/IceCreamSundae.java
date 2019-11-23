import Ingredients.*;


public class IceCreamSundae extends MenuItem{

    IceCreamSundae() {
        mainIngredient = (137,7,16,2.3,.0029, "Ice Cream");
		price = 4.50;
    }

    @Override
    void addTopping(String ingredientName) {
        switch (ingredientName) {
			case "Chocolate Syrup" -> toppings.add(new ChocolateSyrup());
			case "Whipped Cream" -> toppings.add(new WhippedCream());
			case "Peanut" -> toppings.add(new Peanut());
			case "Cherries" -> toppings.add(new Cherry());
        }

    }
}
