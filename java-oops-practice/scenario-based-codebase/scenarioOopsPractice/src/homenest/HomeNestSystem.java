package homenest;
import java.util.Scanner;

public class HomeNestSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter device type: \n1-Light \n2-Camera \n3-Thermostat \n4-Lock");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Device ID: ");
        int deviceId = sc.nextInt();

        Device device = null;

        switch (choice) {
            case 1 -> device = new Light(deviceId);
            case 2 -> device = new Camera(deviceId);
            case 3 -> device = new Thermostat(deviceId);
            case 4 -> device = new Lock(deviceId);
            default -> {
                System.out.println("Invalid choice");
                System.exit(0);
            }
        }

        device.turnOn();
        System.out.println("Energy Usage: " + device.getEnergyUsage());

        device.reset();
        device.turnOff();

        // Read-only firmware logs
        System.out.println("Firmware Logs: " + device.getFirmwareLogs());

        sc.close();
    }
}
