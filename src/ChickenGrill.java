/**
 * <h1>ChickenGrill</h1>
 * The ChickenGrill class is used as an ingredient in Grilled Chicken Sandwiches
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class ChickenGrill extends Ingredient {

    public ChickenGrill() {
        //set nutritional value of grilled chicken * serving size
        calories = 50*3;
        fat = 1*3;
        carbohydrate = 0.0;
        protein = 20*3;
        serving_size = "3oz";
        cholesterol = .03*3;
    }
}
