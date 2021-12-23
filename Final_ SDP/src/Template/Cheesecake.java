package Template;

import Decorator.Decoration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cheesecake extends Cake{
    String[] ingredientsUsed={"Block cream cheese", "sugar", "sour cream", "eggs", "vanilla extract"};

    public Cheesecake(Decoration newDecoration) {
        super(newDecoration);
    }

    @Override
    void addIngredients() {
        System.out.println("Making cheesecake: ");
        for(String ingredients: ingredientsUsed){
            System.out.println(ingredients+ " ");
        }
    }

    @Override
    void mix() {
        System.out.println("Mixing and baking...");
    }


    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getCost() {
        System.out.println("Cost of cake: " + 5000);
        System.out.println("Total cost: ");
        return super.getCost()+5000;
    }
}
