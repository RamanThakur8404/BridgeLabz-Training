package com.collections.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesPerservedOrder {
	
	public static List<Integer> removeDuplicates(List<Integer>list){
		LinkedHashSet<Integer> set = new LinkedHashSet(list);
		return new ArrayList<>(set);
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList();
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		
		List<Integer> removeDuplicates = removeDuplicates(list);
		System.out.println(removeDuplicates);
	}
}
