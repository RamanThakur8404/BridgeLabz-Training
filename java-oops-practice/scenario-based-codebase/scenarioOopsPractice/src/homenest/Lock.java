package homenest;

public class Lock extends Device {

    public Lock(int deviceId) {
        super(deviceId);
    }

    public void turnOn() {
        setStatus("on");
        addEnergyUsage(2);
        System.out.println("Lock engaged");
    }

    public void turnOff() {
        setStatus("off");
        System.out.println("Lock disengaged");
    }

    public void reset() {
        System.out.println("Lock reset: security keys refreshed");
    }
}
