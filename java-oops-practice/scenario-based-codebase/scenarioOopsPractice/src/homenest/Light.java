package homenest;

public class Light extends Device {

    public Light(int deviceId) {
        super(deviceId);
    }

    public void turnOn() {
        setStatus("on");
        addEnergyUsage(5); // operator usage
        System.out.println("Light ON");
    }

    public void turnOff() {
        setStatus("off");
        System.out.println("Light OFF");
    }

    public void reset() {
        System.out.println("Light reset: brightness restored");
    }
}
