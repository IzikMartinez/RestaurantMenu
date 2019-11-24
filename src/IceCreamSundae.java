import Ingredients.*;


public class IceCreamSundae extends MenuItem{

    IceCreamSundae() {
        mainIngredient = new Ingredient(137,7,16,2.3, "Ice Cream");
		price = 4.50;
		name = "Ice Cream Sundae";
        validToppings.add("Chocolate Syrup");
        validToppings.add("Whipped Cream");
        validToppings.add("Peanut");
        validToppings.add("Cherries");

    }

    @Override
    public void addTopping(String ingredientName) {
        switch (ingredientName) {
			case "Chocolate Syrup" -> toppings.add(new ChocolateSyrup());
			case "Whipped Cream" -> toppings.add(new WhippedCream());
			case "Peanut" -> toppings.add(new Peanut());
			case "Cherries" -> toppings.add(new Cherry());
        }

    }
}
