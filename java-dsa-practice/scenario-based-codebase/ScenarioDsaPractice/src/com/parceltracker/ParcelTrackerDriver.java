package com.parceltracker;
public class ParcelTrackerDriver {
    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.trackParcel();

        tracker.addCheckpoint("Shipped", "Customs Check");
        tracker.trackParcel();

        tracker.checkStatus("In Transit");
        tracker.checkStatus("Warehouse");
    }
}
