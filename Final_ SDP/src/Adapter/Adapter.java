package Adapter;

import Observer.Observer;

public class Adapter implements Observer {
    SendOrder sendOrder;
    @Override
    public void update() {
        sendOrder.sent();
    }
}
