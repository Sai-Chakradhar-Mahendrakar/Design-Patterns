import Builder.CustomMealBuilder;
import Builder.MealBuilder;
import Builder.NonVegMealBuilder;
import Builder.VegMealBuilder;
import Director.MealDirector;
import Meals.Meal;

public class MealBuilderClient {
    public static void main(String args[]){
        MealDirector director = new MealDirector();

        // Construct Veg Meal
        MealBuilder vegMealBuilder = new VegMealBuilder();
        Meal vegMeal = director.constructVegMeal(vegMealBuilder);
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost() + " INR\n");

        // Construct Non Veg Meal
        MealBuilder nonVegBuilder = new NonVegMealBuilder();
        Meal nonVegMeal = director.constructNonVegMeal(nonVegBuilder);
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost() + " INR\n");

        // Construct Custom Meal
        MealBuilder customMealBuilder = new CustomMealBuilder();
        customMealBuilder.addBurger("Mixed Burger");
        customMealBuilder.addDrink("Pepsi");
        customMealBuilder.addSide("Onion Rings");
        customMealBuilder.addDessert("Ice Cream");
        Meal customMeal = customMealBuilder.build();
        customMeal.showItems();
        System.out.println("Total cost: " + customMeal.getCost() + " INR");
    }
}
