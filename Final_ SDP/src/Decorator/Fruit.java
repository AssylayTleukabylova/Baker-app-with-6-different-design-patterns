package Decorator;

public class Fruit extends DecorationDecorator{
    public Fruit(Decoration newDecoration) {
        super(newDecoration);
    }

    public String getDescription(){
        return  decoration.getDescription()+", fruits";
    }

    public double getCost(){
        System.out.println("Cost of fruits: "+2000);
        return super.getCost()+2000;
    }
}
