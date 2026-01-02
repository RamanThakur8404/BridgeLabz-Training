package smarthome;

public class Fan extends Appliance {

    public Fan(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        setEnergyUsage(40);
        System.out.println(name + " fan is ON");
    }

    @Override
    public void turnOff() {
        setEnergyUsage(0);
        System.out.println(name + " fan is OFF");
    }
}

