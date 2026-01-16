package com.sorting.robowarehouse;
import java.util.Scanner;

public class RoboWarehouseApp {

	public static void insertionSort(Package []packages) {
		for(int i= 1; i<packages.length; i++) {
			Package key = packages[i];
			int j = i-1;
			while( j>=0 && packages[j].weight > key.weight) {
				packages[j+1] = packages[j];
				j--;
			}
			packages[j+1] = key;
		}
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        Package[] packages = new Package[n];

        // Streaming user input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of package " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            packages[i] = new Package(weight);
        }

        insertionSort(packages);

        System.out.println("\nShelf order (Ascending by weight):");
        for (Package p : packages) {
            System.out.println(p.weight + " kg");
        }

        sc.close();
    }
}
