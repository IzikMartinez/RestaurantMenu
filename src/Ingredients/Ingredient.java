package Ingredients;

public class Ingredient {
    protected String serving_size;
    protected double calories;
    protected double carbohydrate;
    protected double protein;
    protected double fat;
    protected double cholesterol;
    protected String name;

    Ingredient() {
    }

    Ingredient(double calories, double carbohydrate, double protein, double fat, String name) {
        this.calories = calories;
        this.carbohydrate = carbohydrate;
        this.protein = protein;
        this.fat = fat;
        this.name = name;
    }

    public void printNutrition() {
        System.out.printf("\nCalories: %.2f\n" +
                "Carbohydrates: %.2fg\nProtein: %.2fg\n" +
                "Fat: %.2fg\n", calories, carbohydrate, protein, fat);
    }

    public void setServings(int quantity) {
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getCarbs() {
        return carbohydrate;
    }

    public double getFat() {
        return fat;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public double getProtein() {
        return protein;
    }

}
