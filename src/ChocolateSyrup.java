/**
 * <h1>ChocolateSyrup</h1>
 * The ChocolateSyrup class is used as an ingredient in IceCreamSundaes
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class ChocolateSyrup extends Ingredient {

    public ChocolateSyrup() {
        //set Nutritional Value of ingredient
        calories = 109;
        fat = .4;
        carbohydrate = 25;
        protein = .8;
        cholesterol = 0;
        //set name and serving size
		serving_size = "2 tbsp";
		name ="Chocolate Syrup";

    }
}
