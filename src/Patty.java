/**
 * <h1>Patty</h1>
 * The patty class is used as an ingredient in Hamburger
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class Patty extends Ingredient {

    public Patty() {
        //set nutritional value of ingredient
        super(71*3,0.0,4.8*3,5.6*3,"Patty");

        serving_size = "3oz";
        cholesterol = 19.9*3;
    }
}
