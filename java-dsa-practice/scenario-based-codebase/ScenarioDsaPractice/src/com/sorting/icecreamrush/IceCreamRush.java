package com.sorting.icecreamrush;
import java.util.Scanner;

public class IceCreamRush {
	public static void sortFlavors(IceCreamFlavor[] flavors) {
        int n = flavors.length;
        boolean swapped;

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (flavors[j].getSales() < flavors[j + 1].getSales()) {
                    // Swap flavors[j] and flavors[j + 1] if sales are in wrong order
                    IceCreamFlavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped in this pass, the array is sorted
            if (!swapped) break;
        }
    }	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the sales data for 8 flavors
        System.out.println("Enter number of ice cream flavors:");
        int n = scanner.nextInt();
        IceCreamFlavor[] flavors = new IceCreamFlavor[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of flavor " + (i + 1) + ": ");
            String flavorName = scanner.nextLine();

            System.out.print("Enter the sales for " + flavorName + ": ");
            int sales = scanner.nextInt();
            scanner.nextLine();  // Consume newline character after reading integer

            flavors[i] = new IceCreamFlavor(flavorName, sales);
        }

        // Sort the flavors by sales using Bubble Sort
        sortFlavors(flavors);

        // Display the sorted list of flavors
        System.out.println("\nSorted list of ice cream flavors by popularity (most sold to least sold):");
        for (IceCreamFlavor flavor : flavors) {
            System.out.println(flavor.getFlavorName() + "\n" + flavor.getSales());
        }

        scanner.close();
    }
}
