package Decorator;

public class WhippedCream implements Decoration{

    @Override
    public String getDescription() {
        return "Decorate cake with whipped cream";
    }

    @Override
    public double getCost() {
        return 0;
    }
}
