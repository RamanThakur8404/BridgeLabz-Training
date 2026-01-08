package tourmate;

class Hotel {
    private double costPerDay;
    private int days;

    public Hotel(double costPerDay, int days) {
        this.costPerDay = costPerDay;
        this.days = days;
    }

    double getCost() {
        return costPerDay * days;
    }
}
