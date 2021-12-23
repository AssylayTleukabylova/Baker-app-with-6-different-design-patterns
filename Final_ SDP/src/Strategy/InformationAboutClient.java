package Strategy;

import Decorator.EdibleFlowers;
import Decorator.Fruit;
import Decorator.WhippedCream;
import Template.Cheesecake;
import Template.ChocolateCake;
import Template.HoneyCake;

public class InformationAboutClient implements Strategy{
    @Override
    public String information(String name, String date, int chooseCake) {
        System.out.println(name);
        System.out.println(date);
        if(chooseCake==1){
            Cheesecake cheesecake=new Cheesecake(new EdibleFlowers(new Fruit(new WhippedCream())));
            System.out.println(cheesecake.getCost());
        } else if(chooseCake==2){
            ChocolateCake chocolateCake=new ChocolateCake(new EdibleFlowers(new Fruit(new WhippedCream())));
            System.out.println(chocolateCake.getCost());
        } else if(chooseCake==3){
            HoneyCake honeyCake=new HoneyCake(new EdibleFlowers(new Fruit(new WhippedCream())));
            System.out.println(honeyCake.getCost());
        }
        return "";
    }
}
