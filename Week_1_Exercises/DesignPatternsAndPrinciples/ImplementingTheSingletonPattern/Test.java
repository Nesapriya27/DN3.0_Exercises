public class SingletonTest {

    public static void main(String[] args) {
        // Get two instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Logger1 and Logger2 are the same instance: " + (logger1 == logger2));

        // Test the logging functionality
        logger1.log("This is a test message.");
        logger2.log("This message should come from the same instance.");
    }
}
