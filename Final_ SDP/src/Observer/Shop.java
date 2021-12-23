package Observer;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject{
    private List<Client> clients=new ArrayList<>();

    @Override
    public void addClients(Client client) {
      clients.add(client);
    }

    @Override
    public void notifyClients() {
        for (Client cs:clients){
            cs.update();
        }
    }


}
