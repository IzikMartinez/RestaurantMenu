/**
 * <h1>Tomato</h1>
 * The Tomato class is used as an ingredient in Hamburger
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class Tomato extends Ingredient{
    public Tomato() {
        //set nutritional value and serving size
        super(3.6,0.8,0.2,0.0,"Tomato");
        serving_size = "20g (approximately one slice)";
    }
}
