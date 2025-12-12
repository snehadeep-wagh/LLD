package ObserverDesignPattern;

import ObserverDesignPattern.Observable.ObservableInterface;
import ObserverDesignPattern.Observable.WeatherObservableClass;
import ObserverDesignPattern.Observer.Phone;
import ObserverDesignPattern.Observer.Tablet;

public class main {
    public static void main(String args[]){
        ObservableInterface observableInterface;
        observableInterface = new WeatherObservableClass();

        observableInterface.add(new Phone(observableInterface));
        // observableInterface.add(new Tablet(observableInterface));

        observableInterface.setData(13);
    }
}
