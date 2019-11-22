import Ingredients.*;


public class Hamburger extends MenuItem{

    Hamburger() {
        mainIngredient = new Patty();
    }

    @Override
    void addTopping(String ingredientName) {
        switch (ingredientName) {
            case "Ketchup" -> toppings.add(new Ketchup());
            case "Lettuce" -> toppings.add(new Lettuce());
            case "Tomato" -> toppings.add(new Tomato());
            case "Mustard" -> toppings.add(new Mustard());
            case "Pickles" -> toppings.add(new Pickles());
        }
        //ketchup
        //lettuce
        //tomato
        //mustard
        //pickles
        //onion
    }
}
