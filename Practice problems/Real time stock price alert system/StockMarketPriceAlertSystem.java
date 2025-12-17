import observable.GoogleStockObservable;
import observable.StockPriceObservable;
import observer.AnalyticServiceObserver;
import observer.LoggerObserver;
import observer.MobileAppObserver;
import observer.StockPriceObserver;

public class StockMarketPriceAlertSystem {
    public static void main(String[] args) {
        StockPriceObservable googleObservable = new GoogleStockObservable();

        StockPriceObserver mobileAppObserver = new MobileAppObserver(googleObservable);
        StockPriceObserver analyticServiceObserver = new AnalyticServiceObserver(googleObservable);
        StockPriceObserver loggerObserver = new LoggerObserver(googleObservable);

        googleObservable.addObserver(mobileAppObserver);
        googleObservable.addObserver(analyticServiceObserver);

        googleObservable.setStockPrice(1.20D);

        googleObservable.removeObserver(mobileAppObserver);

        googleObservable.setStockPrice(3.49D);

    }
}