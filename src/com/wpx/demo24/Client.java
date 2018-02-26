package com.wpx.demo24;

public class Client {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("\nTotal Cost: "+ vegMeal.getCost());
	
		Meal prepareNonVeMeal = mealBuilder.prepareNonVeMeal();
		System.out.println("NonVegMeal");
		prepareNonVeMeal.showItems();
		System.out.println("\nTotal Cost : "+prepareNonVeMeal.getCost());
	}
}
