package smarthome;

public class MainController {

    public static void main(String[] args) {

        Appliance light = new Light("Bedroom");
        Appliance fan = new Fan("Hall");
        Appliance ac = new AC("Living Room", 120);

        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        // Energy comparison using operators
        if (ac.getEnergyUsage() > fan.getEnergyUsage()) {
            System.out.println("AC consumes more energy than Fan");
        }

        if (light.getEnergyUsage() < fan.getEnergyUsage()) {
            System.out.println("Light consumes less energy than Fan");
        }

        light.turnOff();
        fan.turnOff();
        ac.turnOff();
    }
}
