import Ingredients.Ingredient;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuItem {
    Ingredient mainIngredient;
    private double calories, cholesterol, carbohydrates, fat, protein;
    protected List<Ingredient> toppings = new ArrayList<>();
    protected double price;

    public  abstract void addTopping(String ingredientName);
    public void removeTopping(String ingredientName) {
        int i = 0;
        boolean foundFlag = false;

        for(Ingredient topping: toppings) {
            if(topping.getName().equals(ingredientName)) {
                foundFlag = true;
                break;
            }
            i++;
        }

        if(foundFlag)
            toppings.remove(i);
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
        Calories: %.1f<br>
        Carbohydrates: %.1f<br>
        Fat: %.1f<br>
        Protein: %.1f<br>
               """.formatted(calories,carbohydrates,fat,protein);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
