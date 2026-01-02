package smarthome;

public class Light extends Appliance {

    public Light(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        setEnergyUsage(10);
        System.out.println(name + " light is ON");
    }

    @Override
    public void turnOff() {
        setEnergyUsage(0);
        System.out.println(name + " light is OFF");
    }
}
