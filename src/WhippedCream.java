/**
 * <h1>WhippedCream</h1>
 * The WhippedCream class is used as an ingredient in IceCreamSundae
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */package Ingredients;

public class WhippedCream extends Ingredient {

    public WhippedCream() {
        //set nutritional value, name, and serving size
        calories = 15;
        fat = 1.3;
        carbohydrate = .8;
        protein = .2;
        cholesterol = .0046;
        name = "Whipped Cream";
		
		serving_size = "2 tbsp";
    }
}
