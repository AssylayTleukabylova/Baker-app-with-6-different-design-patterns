import Adapter.Adapter;
import Adapter.SendOrder;
import Decorator.*;
import Observer.Client;
import Observer.Shop;
import State.StatusContext;
import Strategy.Context;
import Strategy.InformationAboutClient;
import Template.*;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StatusContext statusContext = new StatusContext();
        statusContext.status();
        Calendar calendar = Calendar.getInstance();
        Adapter adapter = new Adapter();
        SendOrder sendOrder = new SendOrder();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        while (true) {
            if (dayOfWeek > 1 && dayOfWeek < 7) {
                System.out.println("What is your name?");
                String name = in.next();
                System.out.println("Please,choose a cake: ");
                System.out.println("1-Cheese Cake");
                System.out.println("2-Chocolate Cake");
                System.out.println("3-Honey Cake");
                int chooseCake = in.nextInt();
                if (chooseCake == 1) {
                    Cheesecake cheesecake = new Cheesecake(new EdibleFlowers(new Fruit(new WhippedCream())));
                    cheesecake.prepareCakeRecipe();
                    System.out.println(cheesecake.getDescription());
                    System.out.println(cheesecake.getCost());
                } else if (chooseCake == 2) {
                    ChocolateCake chocolateCake = new ChocolateCake(new EdibleFlowers(new Fruit(new WhippedCream())));
                    chocolateCake.prepareCakeRecipe();
                    System.out.println(chocolateCake.getDescription());
                    System.out.println(chocolateCake.getCost());
                } else if (chooseCake == 3) {
                    HoneyCake honeyCake = new HoneyCake(new EdibleFlowers(new Fruit(new WhippedCream())));
                    honeyCake.prepareCakeRecipe();
                    System.out.println(honeyCake.getDescription());
                    System.out.println(honeyCake.getCost());
                }

                System.out.println("Please,Choose the date");
                String date = in.next();
                Client client = new Client(name, date);
                Shop cake = new Shop();
                cake.addClients(client);
                cake.notifyClients();
                System.out.println("Information about order:");
                Context context = new Context(new InformationAboutClient());
                context.executeStrategy(name, date, chooseCake);
                System.out.println("Do you agree about order(yes/no)?");
                String chooseAgree = in.next();
                if (chooseAgree.equals("Yes") || chooseAgree.equals("yes")) {
                    System.out.println("Thank you to choose us!");
                    sendOrder.sent();
                    break;
                }
            } else {
                break;
            }
        }


    }
}





