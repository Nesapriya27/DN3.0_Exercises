public class Logger {
    private static Logger instance;
    private Logger() {
    }

    // Step 3: Public static method to get the instance of the Logger class
    public static Logger getInstance() {
        // Create the instance if it does not exist
        if (instance == null) {
            synchronized (Logger.class) {
                // Double-check locking for thread safety
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Example method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
