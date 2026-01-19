package com.generics.mealplangenerator;
class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void displayMealDetails() {
        mealPlan.displayMealInfo();
    }

    public static <T extends MealPlan> boolean validateMealPlan(T mealPlan) {
        if (mealPlan instanceof VegetarianMeal) {
            System.out.println("Validating Vegetarian Meal...");
            return true;
        } 
        else if (mealPlan instanceof VeganMeal) {
            System.out.println("Validating Vegan Meal...");
            return true;
        }
        else if (mealPlan instanceof HighProteinMeal) {
            System.out.println("Validating High-Protein Meal...");
            return true;
        }
        return false;
    }
}
