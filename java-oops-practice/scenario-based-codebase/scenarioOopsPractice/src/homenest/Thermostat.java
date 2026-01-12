package homenest;

public class Thermostat extends Device {

    public Thermostat(int deviceId) {
        super(deviceId);
    }

    public void turnOn() {
        setStatus("on");
        addEnergyUsage(15);
        System.out.println("Thermostat ON");
    }

    public void turnOff() {
        setStatus("off");
        System.out.println("Thermostat OFF");
    }

    public void reset() {
        System.out.println("Thermostat reset: temperature normalized");
    }
}
