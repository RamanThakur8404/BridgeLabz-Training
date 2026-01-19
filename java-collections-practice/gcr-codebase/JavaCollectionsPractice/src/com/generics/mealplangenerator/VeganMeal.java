package com.generics.mealplangenerator;
class VeganMeal implements MealPlan {
    @Override
    public void displayMealInfo() {
        System.out.println("This is a Vegan Meal Plan. It includes only plant-based foods, no animal products.");
    }
}