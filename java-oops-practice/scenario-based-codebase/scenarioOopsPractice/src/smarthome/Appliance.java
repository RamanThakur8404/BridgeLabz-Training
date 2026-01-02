package smarthome;

public class Appliance implements Controllable {

    protected String name;
    private boolean powerStatus;
    private int energyUsage;

    // Default power setting
    public Appliance(String name) {
        this.name = name;
        this.powerStatus = false;
        this.energyUsage = 0;
    }

    // User-defined power setting
    public Appliance(String name, int energyUsage) {
        this.name = name;
        this.energyUsage = energyUsage;
        this.powerStatus = false;
    }

    protected void setEnergyUsage(int usage) {
        this.energyUsage = usage;
    }

    public int getEnergyUsage() {
        return energyUsage;
    }

    @Override
    public void turnOn() {
        powerStatus = true;
        System.out.println(name + " is ON");
    }

    @Override
    public void turnOff() {
        powerStatus = false;
        setEnergyUsage(0);
        System.out.println(name + " is OFF");
    }
}
