package Builder;

import Meals.Meal;

public interface MealBuilder {
    void addBurger(String burger);
    void addDrink(String drink);
    void addSide(String side);
    void addDessert(String dessert);
    Meal build();    
}
