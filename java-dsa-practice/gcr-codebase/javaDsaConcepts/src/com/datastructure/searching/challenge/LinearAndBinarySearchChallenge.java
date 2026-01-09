package com.datastructure.searching.challenge;

import java.util.Scanner;

public class LinearAndBinarySearchChallenge {
	static int findMissingInteger(int[] arr) {
		boolean temp[] = new boolean[arr.length+1];
		
		for(int num : arr) {
			if(num>0 && num <= arr.length)
				temp[num] = true;
		}
		
		for(int i = 1;i<temp.length;i++) {
			if(!temp[i])
				return i;
		}
		return arr.length+1;
	}
	
	static int findTarget(int arr[], int target) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid]>target) {
				right = mid-1;				
			}
			else {
				left = mid+1;
			}	
		}
		return -1;
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        System.out.println("Enter the target value:");
	        int target = sc.nextInt();

		int missing = findMissingInteger(arr);
		int index = findTarget(arr,target);
		System.out.println("First Missing Positive Integer: "+missing);
		if(index !=-1)
			System.out.println("Target at: " + index + " index");
		else
			System.out.println("Not Found!!!");
		
	}
}