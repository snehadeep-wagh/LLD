package observable;

import java.util.*;
import observer.StockPriceObserver;

public class GoogleStockObservable implements StockPriceObservable {
    private double stockPrice;
    String stockId;
    String stockName;
    private List<StockPriceObserver> observers;

    public GoogleStockObservable() {
        observers = new ArrayList<>();
        stockPrice = 0.0D;
        stockId = "GOOGL";
        stockName = "GOOGLE";
    }

    @Override
    public String getStockId(){
        return stockId;
    }

    @Override
    public String getStockName(){
        return stockName;
    }

    @Override
    public double getStockPrice() {
        return stockPrice;
    }

    @Override
    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyAllObserver();
    }

    @Override
    public void addObserver(StockPriceObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockPriceObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (StockPriceObserver observer : observers) {
            observer.update();
        }
    }
}
