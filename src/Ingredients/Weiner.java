package Ingredients;
//This is the main ingredient for hot dog in the Ingredients package.
//Includes the nutrition values of it.
public class Weiner  extends Ingredient {

    public Weiner() {
        calories = 40*1.7;
        fat = 0.5*1.7;
        carbohydrate = 3*1.7;
        protein = 5*1.7;
        serving_size = "1.7 oz";
        cholesterol = 15*1.7;
    }
}
