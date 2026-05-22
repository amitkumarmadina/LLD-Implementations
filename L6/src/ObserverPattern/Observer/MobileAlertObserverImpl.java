package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable){
        this.observable = observable;
        this.userName = emailId;
    }

    public void update(){
        sendMsgOnMobile(userName, "product is in stock hurry up!!");
    }

    public void sendMsgOnMobile(String userName, String msg){
        System.out.println("mail sent to : " + userName);
    }

}
