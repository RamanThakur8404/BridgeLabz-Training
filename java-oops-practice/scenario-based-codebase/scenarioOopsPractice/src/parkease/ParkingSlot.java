package parkease;
class ParkingSlot {
    private int slotId;
    private boolean isOccupied;
    private String vehicleType;
    private String bookingLog; // internal record

    public ParkingSlot(int slotId, String vehicleType) {
        this.slotId = slotId;
        this.vehicleType = vehicleType;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void bookSlot(String vehicleNumber) {
        if (!isOccupied) {
            isOccupied = true;
            bookingLog = "Slot " + slotId + " booked for vehicle " + vehicleNumber;
        }
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog = "Slot " + slotId + " is now free";
    }

    public String getBookingLog() {
        return bookingLog;
    }
}
