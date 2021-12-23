package Strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(String name, String date, int chooseCake){
        return strategy.information(name,date,chooseCake);
    }
}
