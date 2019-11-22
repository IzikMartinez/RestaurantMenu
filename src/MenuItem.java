import Ingredients.Ingredient;
import Ingredients.Ketchup;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuItem {
    Ingredient mainIngredient;
    private double calories, cholesterol, carbohydrates, fat, protein;
    List<Ingredient> toppings = new ArrayList<>();


    abstract void addTopping(String ingredientName);


    public void removeTopping(String ingredientName) {
        int i = 0;
        for( Ingredient topping : toppings ) {
            if(topping.getName().equals(ingredientName))
                break;
            i++;
        }

        System.out.println(toppings.size());
        System.out.println(toppings.get(i).getName());
        toppings.remove(i);
    }

    void sumOfNutrients() {
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
        <html>
        Calories: %s<br>
        Carbohydrates: %s<br>
        Fat: %s<br>
        Protein: %s<br>
        </html>
                """.formatted(calories,carbohydrates,fat,protein);
    }
}
