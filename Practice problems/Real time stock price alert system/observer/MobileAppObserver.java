package observer;

import observable.StockPriceObservable;

public class MobileAppObserver implements StockPriceObserver {

    private StockPriceObservable stockPriceObservable;

    public MobileAppObserver(StockPriceObservable sObservable) {
        stockPriceObservable = sObservable;
    }

    @Override
    public void update() {
        System.out.println("Stock Price change alert for Mobile App!!\nStock value for "
                + stockPriceObservable.getStockName() + " has been changed. current price of the stock is: "
                + String.valueOf(stockPriceObservable.getStockPrice()) + "\n");
    }
}
