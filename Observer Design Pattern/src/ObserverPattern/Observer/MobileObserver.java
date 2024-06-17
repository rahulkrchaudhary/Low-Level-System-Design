package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileObserver implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public MobileObserver(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is stock hurry up!!!");

    }
    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("msg sent to: "+userName);
    }
}
