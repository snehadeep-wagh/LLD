package observer;

import observable.StockPriceObservable;

public class AnalyticServiceObserver implements StockPriceObserver {

    private StockPriceObservable stockPriceObservable;

    public AnalyticServiceObserver(StockPriceObservable sObservable) {
        stockPriceObservable = sObservable;
    }

    @Override
    public void update() {
        System.out.println("Stock Price change alert for Analytic Service!!\nStock value for "
                + stockPriceObservable.getStockName() + " has been changed. current price of the stock is: "
                + String.valueOf(stockPriceObservable.getStockPrice()) + "\n");
    }
}
