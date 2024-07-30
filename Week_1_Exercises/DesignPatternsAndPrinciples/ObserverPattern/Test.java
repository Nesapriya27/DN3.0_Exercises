public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        stockMarket.setStockName("AAPL");

        MobileApp mobileApp = new MobileApp("MobileApp");
        WebApp webApp = new WebApp("WebApp");

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        stockMarket.setStockPrice(150.0);
        stockMarket.setStockPrice(155.0);

        stockMarket.deregister(mobileApp);
        stockMarket.setStockPrice(160.0);
    }
}
