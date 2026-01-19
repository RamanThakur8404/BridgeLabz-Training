package com.generics.mealplangenerator;
public class MealPlanGenerator {
    public static void main(String[] args) {
        // Create instances of the different meal types
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());

        // Generate and print the meal plans
        vegetarianMeal.displayMealDetails();
        veganMeal.displayMealDetails();
        highProteinMeal.displayMealDetails();
    }
}
