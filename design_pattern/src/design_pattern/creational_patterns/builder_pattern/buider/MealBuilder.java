package design_pattern.creational_patterns.builder_pattern.buider;
import design_pattern.creational_patterns.builder_pattern.dto.ChickenBurger;
import design_pattern.creational_patterns.builder_pattern.dto.Coke;
import design_pattern.creational_patterns.builder_pattern.dto.Pepsi;
import design_pattern.creational_patterns.builder_pattern.dto.VegBurger;


public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
