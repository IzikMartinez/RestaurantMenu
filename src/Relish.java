/**
 * <h1>Relish</h1>
 * The Relish class is used as an ingredient in Hotdog
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class Relish extends Ingredient {
    public Relish() {
        //set nutritional value
        super(20,5,0.1,0.1,"Relish");
        serving_size = ".5 oz";
    }
}
