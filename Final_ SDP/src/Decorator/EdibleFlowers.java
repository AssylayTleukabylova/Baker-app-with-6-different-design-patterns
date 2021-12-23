package Decorator;

public class EdibleFlowers extends DecorationDecorator{
    public EdibleFlowers(Decoration decoration){
        super(decoration);
    }



    @Override
    public String getDescription() {
        return super.getDescription()+", edible flowers";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of edible flowers: "+1500);
        return super.getCost()+1500;
    }

}
