package com.sorting.fitnesstracker;
import java.util.Scanner;

public class FitnessTracker {

    public static void bubbleSort(User[] users) {
        int n = users.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (users[j].getSteps() < users[j + 1].getSteps()) {
                    swap(users, j, j + 1);
                }
            }
        }
    }

    private static void swap(User[] users, int i, int j) {
        User temp = users[i];
        users[i] = users[j];
        users[j] = temp;
    }
    
    public static void main(String []args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the number of users (max 20):");
    	int n = scanner.nextInt();
    	
    	if(n>20) {
    		System.out.println("The group size must be less than or equal to 20");
    	}
    	
    	User[] users = new User[n];
    	for (int i = 0; i < users.length; i++) {
    		System.out.println("Enter the name of" +  (i+1) + "user: ");
    		String name = scanner.next();
    		
    		System.out.println("Enter the number of steps walked by " +  (i+1) + "user: ");
    		int steps = scanner.nextInt();
    		
			users[i] = new User(name,steps);
		}
    	
    	bubbleSort(users);
    	System.out.println("The data in sorted order is:");
    	for(User user:users) {
    		System.out.println(user);
    	}
    }
}
