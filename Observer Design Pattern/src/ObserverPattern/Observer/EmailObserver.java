package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailObserver implements NotificationAlertObserver{
    String email;
    StockObservable observable;

    public EmailObserver(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMAil(email,"product is on stock now hurry up!!!");
    }
    private void sendMAil(String emailId, String msg){
        System.out.println("mail sent to: "+emailId );
    }

}
