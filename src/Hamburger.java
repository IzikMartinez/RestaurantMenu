import Ingredients.*;

public class Hamburger extends MenuItem{

    Hamburger() {
        mainIngredient = new Patty();
        price = 6.70;
        name = "Hamburger";
        validToppings.add("Ketchup");
        validToppings.add("Lettuce");
        validToppings.add("Tomato");
        validToppings.add("Mustard");
        validToppings.add("Pickles");

    }

    @Override
    public void addTopping(String ingredientName) {
        switch (ingredientName) {
            case "Ketchup" -> toppings.add(new Ketchup());
            case "Lettuce" -> toppings.add(new Lettuce());
            case "Tomato" -> toppings.add(new Tomato());
            case "Mustard" -> toppings.add(new Mustard());
            case "Pickles" -> toppings.add(new Pickles());
        }
    }
}
