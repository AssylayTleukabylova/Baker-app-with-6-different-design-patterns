package Observer;

public class Client implements Observer{
    private String name;
    private String date;


    public Client(String name, String date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public void update() {
        System.out.println("Dear  " + name+", Your order will be ready " + date);
    }

}
