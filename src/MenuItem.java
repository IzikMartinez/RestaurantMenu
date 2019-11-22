import Ingredients.Ingredient;
import Ingredients.Ketchup;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    Ingredient mainIngredient;
    private double calories, cholesterol, carbohydrates, fat, protein;
    private List<Ingredient> toppings = new ArrayList<>();

    public void addTopping() {
        toppings.add(new Ketchup());
    }
    public void removeTopping() {
        toppings.remove(0);
    }

    public void sumOfNutrients() {
        for(Ingredient topping: toppings) {
            calories += topping.getCalories();
            carbohydrates += topping.getCarbs();
            fat += topping.getFat();
            protein += topping.getProtein();
            cholesterol += topping.getCholesterol();
        }
        calories += mainIngredient.getCalories();
        carbohydrates += mainIngredient.getCarbs();
        fat += mainIngredient.getFat();
        protein += mainIngredient.getProtein();
        cholesterol += mainIngredient.getCholesterol();
    }

    @Override
    public String toString() {

        return """
        Calories: %s<br>
        Carbohydrates: %s<br>
        Fat: %s<br>
        Protein: %s<br>
               """.formatted(calories,carbohydrates,fat,protein);
    }
}
