package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.ObservableInterface;

public class Phone implements ObserverInterface {

    private ObservableInterface observableInterface;

    public Phone(ObservableInterface obj){
        observableInterface = obj;
    }

    @Override
    public void update() {
        System.out.println("Weather in phone: " + observableInterface.getData());
    }
    
}
