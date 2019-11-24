import Ingredients.Ingredient;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuItem {
    List<Ingredient> mainIngredient = new ArrayList<>();
    List<Ingredient> toppings = new ArrayList<>();
    List<String> validToppings = new ArrayList<>();

    private double calories, cholesterol, carbohydrates, fat, protein;
    double price;
    String name;

    private boolean addedFlag = false;

    MenuItem() {
    }

    void initializeNutrients() {
        calories =0; carbohydrates=0; fat=0; protein=0; cholesterol=0;
        for(Ingredient element : mainIngredient) {
            calories += element.getCalories();
            carbohydrates += element.getCarbs();
            fat += element.getFat();
            protein += element.getProtein();
            cholesterol += element.getCholesterol();
        }

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
        Calories: %.1f Cal<br>
        Carbohydrates: %.1fg<br>
        Fat: %.1fg<br>
        Protein: %.1fg<br>
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

    public String getToppings() {
        String toppingList = "";
        if (!toppings.isEmpty()) {
            toppingList = "<br> <blockquote>";
            for (Ingredient topping : toppings) {
                toppingList += topping.getName() + "<br>";
            }
            toppingList += "</blockquote>";
        }
        return toppingList;
    }
}
