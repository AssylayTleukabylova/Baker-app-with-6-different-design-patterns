package Template;

import Decorator.Decoration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoneyCake extends Cake {
    String[] ingredientsUsed={"honey", "butter", "sugar", "eggs", "flour" };

    public HoneyCake(Decoration newDecoration) {
        super(newDecoration);
    }

    @Override
    void addIngredients() {
        System.out.println("Making Honey cake: ");
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
        System.out.println("Cost of cake: " + 9000);
        System.out.println("Total cost: ");
        return super.getCost()+9000;
    }
}
