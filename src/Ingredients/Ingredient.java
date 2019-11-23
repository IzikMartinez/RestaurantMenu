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
