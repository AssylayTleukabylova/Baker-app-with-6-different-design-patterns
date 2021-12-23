package Template;

import Decorator.Decoration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChocolateCake extends Cake{
    String[] ingredientsUsed={"sugar", "unsalted butter", "eggs", "flour", "cocoa powder", "baking powder", "vanilla extract", "milk"};

    public ChocolateCake(Decoration newDecoration) {
        super(newDecoration);
    }

    @Override
    void addIngredients() {
        System.out.println("Making Chocolate cake: ");
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
        System.out.println("Cost of cake: " + 6000);
        System.out.println("Total cost: ");
        return super.getCost()+6000;
    }
}
