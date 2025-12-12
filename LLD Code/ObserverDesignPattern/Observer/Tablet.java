package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.ObservableInterface;

public class Tablet implements ObserverInterface {

    private ObservableInterface observableInterface;

    public Tablet(ObservableInterface obj){
        observableInterface = obj;
    }

    @Override
    public void update() {
        System.out.println("Weather in tablet: " + observableInterface.getData());
    }
    
}
