package Decorator;

public abstract class DecorationDecorator implements Decoration {

    protected Decoration decoration;

    public DecorationDecorator(Decoration newDecoration) {
        decoration=newDecoration;
    }

    @Override
    public String getDescription() {
        return decoration.getDescription();
    }

    @Override
    public double getCost() {
        return decoration.getCost();
    }
}
