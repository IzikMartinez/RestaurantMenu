/**
 * <h1>Ingredient</h1>
 * The Ingredient class is the superclass of all ingredients
 * It has variables for nutritional values, methods for getting and setting the variables
 * @author Jose Franco, Isaac Martinez, and Benjamin Robinson
 * @version 1.0
 * @since 2019-24-11
 */
package Ingredients;

public class Ingredient {
    //Variables for nutrition
    protected String serving_size;
    protected double calories;
    protected double carbohydrate;
    protected double protein;
    protected double fat;
    protected double cholesterol;
    protected String name;

    public Ingredient() {}

    /**
     * Constructor with parameters, sets values to those passed in function
     * @param calories
     * @param carbohydrate
     * @param protein
     * @param fat
     * @param name
     */
    public Ingredient(double calories, double carbohydrate, double protein, double fat, String name) {
        this.calories = calories;
        this.carbohydrate = carbohydrate;
        this.protein = protein;
        this.fat = fat;
        this.name = name;
    }

    /**
     * getName returns the name from Ingredient
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getCalories returns the calories from ingredient
     * @return calories
     */
    public double getCalories() {
        return calories;
    }

    /**
     * getCarbs returns the carbs from ingredient
     * @return carbs
     */
    public double getCarbs() {
        return carbohydrate;
    }

    /**
     * getFat returns the fat from ingredient
     * @return fat
     */
    public double getFat() {
        return fat;
    }

    /**
     * getCholesterol returns the cholesterol from ingredient
     * @return cholesterol
     */
    public double getCholesterol() {
        return cholesterol;
    }

    /**
     * get protein returns the protein from ingredient
     * @return protein
     */
    public double getProtein() {
        return protein;
    }

    /**
     * setCalories sets the calories to the parameter passed
     * @param calories
     */
    public void setCalories(double calories) {
        this.calories = calories;
    }
    /**
     * setCarbohydrate sets the carbs to the parameter passed
     * @param carbohydrate
     */
    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
    /**
     * setProtein sets the protein to the parameter passed
     * @param protein
     */
    public void setProtein(double protein) {
        this.protein = protein;
    }
    /**
     * setFar sets the fat to the parameter passed
     * @param fat
     */
    public void setFat(double fat) {
        this.fat = fat;
    }
    /**
     * setName sets the name to the parameter passed
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
