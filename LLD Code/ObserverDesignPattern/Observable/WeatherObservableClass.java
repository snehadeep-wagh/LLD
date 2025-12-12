package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.ObserverInterface;
import java.util.*;

public class WeatherObservableClass implements ObservableInterface {
    private List<ObserverInterface> listOfObserver;
    Integer temperature;

    public WeatherObservableClass(){
        listOfObserver = new ArrayList<>();
    }

    @Override
    public void add(ObserverInterface obj) {
        listOfObserver.add(obj);
    }

    @Override
    public Integer getData() {
        return temperature;
    }

    @Override
    public void notifyObservers() {
        for (ObserverInterface observer : listOfObserver) {
            observer.update();
        }
    }

    @Override
    public void remove(ObservableInterface obj) {
        listOfObserver.remove(obj);
    }

    @Override
    public void setData(Integer data) {
        temperature = data;
        notifyObservers();
    }
    
}
