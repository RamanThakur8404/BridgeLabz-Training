package com.generics.mealplangenerator;
class VegetarianMeal implements MealPlan {
    @Override
    public void displayMealInfo() {
        System.out.println("This is a Vegetarian Meal Plan. It includes plant-based foods.");
    }
}