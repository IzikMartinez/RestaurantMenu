/**
 * <h1>Hamburger Bun</h1>
 * The HamburgerBun class is used as an ingredient in Hamburger
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class HamburgerBun extends Ingredient{
    public HamburgerBun() {
        //set nutritional value of ingredient
        super(210,35,5,6,"Bun");
        serving_size = "1 bun";
    }
}
