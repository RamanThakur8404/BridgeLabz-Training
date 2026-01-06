package com.datastructure.stackandqueue.circulartour;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CircularTour {
	public static int findStartPoint(Queue<PetrolPump> queue, int n) {
		int start = 0;
		int petrolBal = 0;
		int visited = 0;
		
		while(start<n) {
			petrolBal = 0;
			visited = 0;
			
			for(PetrolPump pump : queue) {
				petrolBal += pump.petrol - pump.distance;
				visited++;
			
				if(petrolBal < 0) {
					break;
				}
			}
			
			if(visited == n && petrolBal >= 0) {
				return start;
			}
			
			queue.offer(queue.poll());
			start++;
		}
		return -1;
	}
	
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		Queue<PetrolPump> queue = new LinkedList<>();
		
		System.out.print("Enter number of petrol pumps: ");
        int n = scanner.nextInt();

        System.out.println("Enter petrol and distance for each pump:");
        for (int i = 0; i < n; i++) {
            int petrol = scanner.nextInt();
            int distance = scanner.nextInt();
            queue.offer(new PetrolPump(petrol, distance));
        }

        int result = findStartPoint(queue, n);

        if (result == -1) {
            System.out.println("No possible circular tour");
        } else {
            System.out.println("Start at petrol pump index: " + result);
        }		
	}
}
