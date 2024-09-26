package Meals;

public class Meal {
    private String burger;
    private String drink;
    private String side;
    private String dessert;
    private double cost;

    // Getters and Setters
    public void setBurger(String burger){
        this.burger = burger;
    }

    public void setDrink(String drink){
        this.drink = drink;
    }

    public void setSide(String side){
        this.side = side;
    }

    public void setDessert(String dessert){
        this.dessert = dessert;
    }

    // Method to calculate total cost of the meal
    public void setCost(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return this.cost;
    }

    public void showItems() {
        System.out.println("Meal Includes:");
        System.out.println("Burger: " + burger);
        System.out.println("Drink: " + drink);
        if (side != null) System.out.println("Side: " + side);
        if (dessert != null) System.out.println("Dessert: " + dessert);
    }
}
