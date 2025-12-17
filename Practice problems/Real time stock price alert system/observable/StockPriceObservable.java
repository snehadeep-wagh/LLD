package observable;

import observer.StockPriceObserver;

public interface StockPriceObservable {
    public double getStockPrice();
    public void setStockPrice(double stockPrice);
    public void addObserver(StockPriceObserver observer);
    public void removeObserver(StockPriceObserver observer);
    public void notifyAllObserver();
    public String getStockId();
    public String getStockName();
}
