import Ingredients.Ingredient;

public class Drink extends MenuItem{
    Drink() {
        mainIngredient.add(new Ingredient(0,0,0,0,"Default"));
        toppings.add(new Ingredient(430,116,0,0,"Medium Drink"));
        name = "Drink";
        validToppings.add("Small");
        validToppings.add("Medium");
        validToppings.add("Large");

    }

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
