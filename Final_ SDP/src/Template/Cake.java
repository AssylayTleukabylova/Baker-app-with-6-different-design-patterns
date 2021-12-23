package Template;

import Decorator.Decoration;
import Decorator.DecorationDecorator;

public abstract class Cake extends DecorationDecorator {

    public Cake(Decoration newDecoration) {
        super(newDecoration);
    }

    public void prepareCakeRecipe(){
        addIngredients();
        mix();
    }

    abstract void addIngredients();

    abstract void mix();

}
