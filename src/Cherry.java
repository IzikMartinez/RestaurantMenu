/**
 * <h1>Cherry</h1>
 * The cherry class is used as an ingredient in IceCreamSundaes
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class Cherry extends Ingredient {

    public Cherry() {
        //Set nutritional value of cherry
        calories = 16;
        fat = 0;
        carbohydrate = 4;
        protein = 0;
        cholesterol = 0;
        //set name and serving size
        name = "Cherries";
		serving_size = "2 cherries";

    }
}
