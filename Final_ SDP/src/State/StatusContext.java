package State;

import java.util.Calendar;


public class StatusContext {
    ShopStatus currentStatus;
    Calendar calendar = Calendar.getInstance();
    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

    public StatusContext() {
        if(dayOfWeek>1 && dayOfWeek<7){
           currentStatus=new OpenShop();
        }
        else {
            currentStatus=new CloseShop();
        }
    }
    public void status(){
        currentStatus.status(this);
    }
}
