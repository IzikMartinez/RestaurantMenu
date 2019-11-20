package Ingredients;

public class Ingredient {
    protected double serving_size;
    protected double calories;
    protected double carbohydrate;
    protected double protein;
    protected double fat;
    protected double cholesterol;
    private int quantity;

    Ingredient() {
    }

    Ingredient(double calories, double carbohydrate, double protein, double fat) {
        this.calories = calories;
        this.carbohydrate = carbohydrate;
        this.protein = protein;
        this.fat = fat;
    }

    public void printNutrition() {
        System.out.printf("\nCalories: %.2f\n" +
                "Carbohydrates: %.2fg\nProtein: %.2fg\n" +
                "Fat: %.2fg\n", calories*quantity, carbohydrate*quantity, protein*quantity, fat*quantity);
    }

    public void setServings(int quantity) {
        this.quantity = quantity;
    }

    public double getCalories() {
        return calories*quantity;
    }

    public double getCarbs() {
        return carbohydrate*quantity;
    }

    public double getFat() {
        return fat*quantity;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public double getProtein() {
        return protein*quantity;
    }

}
