/**
 * <h1>Pickles</h1>
 * The Pickles class is used as an ingredient in Hamburger
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class Pickles extends Ingredient{
    public Pickles() {
        //set nutritional value of ingredient
        super(20, 4, 0, 0, "Pickles");
        serving_size = "3 slices";
    }
}
