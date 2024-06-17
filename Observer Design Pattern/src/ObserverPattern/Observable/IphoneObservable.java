package ObserverPattern.Observable;
import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    public List<NotificationAlertObserver> observerList =
            new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySuscriber() {
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCountAdded) {
         if(stockCount==0){
             notifySuscriber();
         }
         stockCount=stockCount+newStockCountAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
