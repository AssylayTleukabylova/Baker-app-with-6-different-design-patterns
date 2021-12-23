package State;

public class OpenShop implements ShopStatus{
    @Override
    public void status(StatusContext statusContext) {
        System.out.println("Welcome to our shop!");
    }
}
