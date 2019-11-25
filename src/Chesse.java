/**
 * <h1>Cheese</h1>
 * The Cheese class is used as an ingredient in Hamburgers and grilled chicken sandwiches
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class Chesse extends Ingredient {

    //set nutritional value and name of ingredient
    public Chesse() {
        super(60, 2, 3, 4, "Cheese");
        serving_size = "2 slices";
    }
}
