package Director;

import Meals.Meal;
import Builder.MealBuilder;

public class MealDirector {
    public Meal constructVegMeal(MealBuilder builder) {
        builder.addBurger("Veggie Burger");
        builder.addDrink("Orange Juice");
        builder.addSide("Salad");
        return builder.build();
    }

    public Meal constructNonVegMeal(MealBuilder builder) {
        builder.addBurger("Chicken Burger");
        builder.addDrink("Coke");
        builder.addSide("Fries");
        return builder.build();
    }
}
