package Builder;

import Meals.Meal;

public class CustomMealBuilder implements MealBuilder{
    private Meal meal = new Meal();

    public void addBurger(String burger){ 
        meal.setBurger(burger); 
    }

    public void addDrink(String drink){ 
        meal.setDrink(drink); 
    }

    public void addSide(String side){ 
        meal.setSide(side); 
    }

    public void addDessert(String dessert){
        meal.setDessert(dessert); 
    }

    public Meal build() {
        // Calculate cost based on selected items
        double cost = 0;
        if (meal.getCost() != 0){ 
            cost += meal.getCost();
        }

        if (meal.getCost() != 0){ 
            cost += meal.getCost();
        }

        if (meal.getCost() != 0){ 
            cost += meal.getCost();
        }
        
        meal.setCost(cost);
        return meal;
    }
}
