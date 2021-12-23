package State;

public class CloseShop implements ShopStatus {
    @Override
    public void status(StatusContext statusContext) {
        System.out.println("Unfortunately, shop is closed.Shop is working from Monday to Friday.");
    }
}
