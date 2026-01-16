package com.sorting.cropmonitor;
class SensorData {

    long timestamp;     // epoch time or milliseconds
    double temperature;

    SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}
