/**
 * <h1>Lettuce</h1>
 * The Lettuce class is used as an ingredient in Hamburger
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class Lettuce extends Ingredient{
    public Lettuce() {
        //set nutritional value of ingredient
        super(3.9,0.9,0.3,0.0,"Lettuce");
        serving_size = "1oz";
    }
}
