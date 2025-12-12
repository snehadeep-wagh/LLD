package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.*;

public interface ObservableInterface {
    void add(ObserverInterface obj);
    void remove(ObservableInterface obj);
    void notifyObservers();
    Integer getData();
    void setData(Integer data);
}
