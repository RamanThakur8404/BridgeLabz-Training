package smarthome;

public class AC extends Appliance {

    public AC(String name, int defaultPower) {
        super(name, defaultPower);
    }

    @Override
    public void turnOn() {
        setEnergyUsage(150);
        System.out.println(name + " AC is ON");
    }

    @Override
    public void turnOff() {
        setEnergyUsage(0);
        System.out.println(name + " AC is OFF");
    }
}
