import Ingredients.Ingredient;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuItem {
    Ingredient mainIngredient;
    List<Ingredient> toppings = new ArrayList<>();
    List<String> validToppings = new ArrayList<>();

    private double calories, cholesterol, carbohydrates, fat, protein;
    double price;
    String name;

    private boolean addedFlag = false;

    MenuItem() {

    }

    void initializeNutrients() {
        calories = mainIngredient.getCalories();
        carbohydrates = mainIngredient.getCarbs();
        fat = mainIngredient.getFat();
        protein = mainIngredient.getProtein();
        cholesterol = mainIngredient.getCholesterol();

    }

    public abstract void addTopping(String ingredientName);
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

    void sumOfNutrients() {
        if(!toppings.isEmpty()) {
            //calories =0; carbohydrates=0; fat=0; protein=0; cholesterol=0;
            initializeNutrients();
            for (Ingredient topping : toppings) {
                calories += topping.getCalories();
                carbohydrates += topping.getCarbs();
                fat += topping.getFat();
                protein += topping.getProtein();
                cholesterol += topping.getCholesterol();
            }
        }
    }

    @Override
    public String toString() {
        return """
        <html>
        Calories: %.1f<br>
        Carbohydrates: %.1f<br>
        Fat: %.1f<br>
        Protein: %.1f<br>
        </html>
               """.formatted(calories,carbohydrates,fat,protein);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void flipFlag() {
        addedFlag = !addedFlag;
    }

    public boolean isAddedFlag() {
        return addedFlag;
    }

    public List<String> getValidToppings() {
        return validToppings;
    }
}
