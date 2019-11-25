import Ingredients.*;
/*** <h1>Add Two Numbers!</h1>
* This object extends MenuItem
 * The purpose of this object is to create nutritional values for a new menu item that will be implemented
 * as a button in the Window object.
 *
 * Like all MenuItem subclasses, this class implements the addTopping abstract method with toppings
 * that are deemed valid for french fries to have.
*
* @author  Isaac Martinez, Benjamin Robinson, Jose Franco
* @version 1.0
* @since   2019-11-24
*/
public class Fries extends MenuItem {

     /***
     * This method initializes the nutritional values of the Fries menu item
     * afterwards, it sets the price of the item, as well as its name. The name will be used for boolean checks
     * in other objects within this project.
     *
     *  Finally, this method adds items to the ArrayList of valid toppings. This ArrayList will also be
     *  used for boolean checks in other objects within the project.
     */
    Fries()
    {
        mainIngredient.add(
            new Ingredient(365, 48, 4, 17, "Fries"));
        //"4.1 oz";
        price  = 2.55;
        name = "Fries";
        validToppings.add("Fry Sauce");
        validToppings.add("Ketchup");
    }

    /***
     * This method has a switch statement that matches the input parameter to cases in the switch
     * Because the input of this method will always be valid text returned from a JButton, we can confidently
     * make this method without input validation.
     *
     * once a match has been found in the switch statement, a new ingredient object is created and
     * added to the ArrayList called 'toppings'
     * @param ingredientName
     */
    @Override
    public void addTopping(String ingredientName) {
        switch (ingredientName) {
            case "Ketchup" -> toppings.add(new Ketchup());
            case "Fry Sauce" -> toppings.add(new FrySauce());
        }
    }
}
