public class CommandPatternExample {
    public static void main(String[] args) {
        // Creating the receiver
        Light light = new Light();
        
        // Creating command objects
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Creating the invoker
        RemoteControl remote = new RemoteControl();
        
        // Turning the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turning the light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
