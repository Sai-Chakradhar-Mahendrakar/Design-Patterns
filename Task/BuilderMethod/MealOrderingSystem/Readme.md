# Meal Ordering System Design using Builder Design Pattern

## Objective:
Design a system that allows customers to order meals from a fast-food restaurant. Each meal consists of various items like burgers, drinks, sides, and desserts. The **Builder pattern** should be used to construct the meal.

---

## Requirements:
1. **Meal Items:** Each meal can have the following:
   - **Burger** (e.g., Veggie Burger, Chicken Burger, Mixed Burger)
   - **Drink** (e.g., Cola, Juice, Water)
   - **Side** (e.g., Fries, Salad)
   - **Dessert** (Optional) (e.g., Ice Cream, Cake)

2. **Meal Customization:**
   - A meal must have at least one **burger** and one **drink**.
   - The **side** and **dessert** are optional.
   - The system should allow the customer to customize each item (e.g., add extra cheese, choose drink size).

3. **Meal Director:**
   - Implement a **MealDirector** that simplifies the process of building different types of meals (e.g., a Vegetarian Meal, a Regular Meal, or a Custom Meal).

4. **Builder Classes:**
   - Implement a `MealBuilder` interface that defines the necessary steps for building a meal.
   - Concrete builders (e.g., **VegMealBuilder**, **NonVegMealBuilder**) should implement the `MealBuilder` interface to create different types of meals.

5. **Fluent API:**
   - Use a fluent interface (method chaining) to allow customers to build meals step-by-step in a user-friendly way.

6. **Cost Calculation:**
   - The meal should be able to calculate its total price based on the items included.

7. **Optional Features:**
   - Add support for **Meal Sizes** (Small, Medium, Large).
   - Allow the customer to specify if they want a **combo meal** (with a drink and a side) or à la carte items.

---

## Steps to Implement:

### 1. Define the Product:
- Create a `Meal` class that has properties for burger, drink, side, and dessert. Each of these could also be a class representing more complex objects (like a `Burger` class with size and toppings).

### 2. Create the Builder Interface:
- Define an interface `MealBuilder` with methods like:
   - `addBurger()`
   - `addDrink()`
   - `addSide()`
   - `addDessert()`
   - `build()`
   
- This interface will guide the construction of the `Meal`.

### 3. Implement Concrete Builders:
- Implement concrete classes like:
   - `VegMealBuilder`
   - `NonVegMealBuilder`
   
- These classes will customize the meal creation process.

### 4. Director Class:
- Create a `MealDirector` class that will use the builder to create predefined meal combinations.

### 5. Test the System:
- Implement a main method or test case where a customer orders a meal using the Builder Pattern.

---

## Example Use Case (Fluent API):

```cpp
MealDirector director;
MealBuilder* vegMealBuilder = new VegMealBuilder();

Meal* vegMeal = director.constructVegMeal(vegMealBuilder);
vegMeal->showItems();
std::cout << "Total cost: " << vegMeal->getCost() << std::endl;

MealBuilder* customMealBuilder = new CustomMealBuilder();
Meal* customMeal = customMealBuilder->addBurger("Chicken Burger")
                                    .addDrink("Cola")
                                    .addSide("Fries")
                                    .build();
customMeal->showItems();
std::cout << "Total cost: " << customMeal->getCost() << std::endl;
