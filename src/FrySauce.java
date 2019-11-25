/**
 * <h1>Fry Sauce</h1>
 * The Fry Sauce class is used as an ingredient in Fries
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class FrySauce extends Ingredient {

    public FrySauce() {
        //Set nutritional value and name of ingredient
        super(94,.1,.1,10,"Fry Sauce");
        serving_size = "1 tbsp";
    }
}