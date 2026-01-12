package homenest;

public class Camera extends Device {

    public Camera(int deviceId) {
        super(deviceId);
    }

    public void turnOn() {
        setStatus("on");
        addEnergyUsage(10);
        System.out.println("Camera ON");
    }

    public void turnOff() {
        setStatus("off");
        System.out.println("Camera OFF");
    }

    public void reset() {
        System.out.println("Camera reset: memory cleared");
    }
}
