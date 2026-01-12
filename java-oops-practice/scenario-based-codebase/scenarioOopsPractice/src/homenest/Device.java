package homenest;

public abstract class Device implements IControllable {
	private int deviceId;
	private String status;
	private double energyUsage;
	private final String firmwareLogs;
	
	public Device(int deviceId) {
		this.deviceId = deviceId;
		this.setStatus("off");
		this.energyUsage = 0;
		this.firmwareLogs = " Firmware logs secured";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFirmwareLogs() {
		return firmwareLogs;
	}

	public double getEnergyUsage() {
		return energyUsage;
	}

	public void addEnergyUsage(double value) {
		energyUsage += value;
	}
	
	

	
}
