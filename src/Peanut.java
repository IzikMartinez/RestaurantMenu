/**
 * <h1>Peanuts</h1>
 * The peanuts class is used as an ingredient in IceCreamSundae
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class Peanut extends Ingredient {

    public Peanut() {
        //set nutritional value
        calories = 82;
        fat = 7;
        carbohydrate = 2.3;
        protein = 3.6;
        cholesterol = 0;
        //set name and serving size
        name = "Peanuts";
		serving_size = "14 g";

    }
}
