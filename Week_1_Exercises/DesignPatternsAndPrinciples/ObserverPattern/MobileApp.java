public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(Stock stock) {
        System.out.println(appName + " received stock update: " + stock.getStockName() + " is now " + stock.getStockPrice());
    }
}
