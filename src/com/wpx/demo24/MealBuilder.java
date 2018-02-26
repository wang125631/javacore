package com.wpx.demo24;

public class MealBuilder {

	/**
	 *  ﬂ≤À∫∫±§
	 * @return ≤Õµ•
	 */
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	/**
	 * º¶»‚∫∫±§
	 * @return ≤Õµ•
	 */
	public Meal prepareNonVeMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
