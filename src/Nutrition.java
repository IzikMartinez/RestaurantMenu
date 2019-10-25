public class Nutrition {
    protected double serving_size;
    protected double calories;
    protected double carbohydrate;
    protected double protein;
    protected double fat;

    protected double cholesterol;
    private int quantity;

    Nutrition() {
        calories = 0.2;
        carbohydrate = 0.2;
        protein = 0.2;
        fat = 0.2;
        cholesterol = 0.0;
        serving_size = 1;
    }

    Nutrition(double calories, double carbohydrate, double protein, double fat) {
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
   
    public double getProtein() {
        return protein*quantity;
    }
}
