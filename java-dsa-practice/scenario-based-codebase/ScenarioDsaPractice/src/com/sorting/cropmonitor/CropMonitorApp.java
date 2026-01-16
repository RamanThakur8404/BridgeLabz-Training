package com.sorting.cropmonitor;
import java.util.Scanner;

public class CropMonitorApp {
	
	public static void quickSort(SensorData[] data, int start, int end) {
        if (start >= end) return;
        int pivotIndex = partition(data, start, end);
        quickSort(data, start, pivotIndex - 1);
        quickSort(data, pivotIndex + 1, end);
    }

    private static int partition(SensorData[] data, int start, int end) {
        long pivot = data[end].timestamp;
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (data[j].timestamp <= pivot) {
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i + 1, end);
        return i + 1;
    }

    private static void swap(SensorData[] data, int i, int j) {
        SensorData temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }	

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        SensorData[] readings = new SensorData[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nReading " + (i + 1));
            System.out.print("Enter timestamp: ");
            long timestamp = sc.nextLong();
            System.out.print("Enter temperature: ");
            double temperature = sc.nextDouble();

            readings[i] = new SensorData(timestamp, temperature);
        }

        quickSort(readings, 0, n - 1);

        System.out.println("\nSorted Sensor Data by Timestamp:");
        for (SensorData s : readings) {
            System.out.println(s.timestamp + " -> " + s.temperature + "°C");
        }

        sc.close();
    }
}
