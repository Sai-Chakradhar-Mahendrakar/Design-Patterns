package Builder;

import Meals.Meal;

public class NonVegMealBuilder implements MealBuilder{
    private Meal meal = new Meal();

    @Override
    public void addBurger(String burger) {
        meal.setBurger(burger);
    }

    @Override
    public void addDrink(String drink) {
        meal.setDrink(drink);
    }

    @Override
    public void addSide(String side) {
        meal.setSide(side);
    }

    @Override
    public void addDessert(String dessert) {
        meal.setDessert(dessert);
    }

    @Override
    public Meal build() {
        meal.setCost(200); 
        return meal;
    }   
}
