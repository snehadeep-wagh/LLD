package observer;

import observable.StockPriceObservable;

public class LoggerObserver implements StockPriceObserver {

    private StockPriceObservable stockPriceObservable;

    public LoggerObserver(StockPriceObservable sObservable) {
        stockPriceObservable = sObservable;
    }

    @Override
    public void update() {
        System.out.println("Stock Price change alert for Logger!!\nStock value for "
                + stockPriceObservable.getStockName() + " has been changed. current price of the stock is: "
                + String.valueOf(stockPriceObservable.getStockPrice()) + "\n");
    }
}
