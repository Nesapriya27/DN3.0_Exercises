public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Creating an EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorating the EmailNotifier with SMS functionality
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorating the SMS-EmailNotifier with Slack functionality
        Notifier allChannelNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        // Sending notifications via Email, SMS, and Slack
        allChannelNotifier.send("This is a test notification.");
    }
}
