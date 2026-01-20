package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseArrayList {
	
	public static void reverseLinkedList(LinkedList<Integer> list){
		LinkedList<Integer> reversedList = new LinkedList<>();
		for(Integer item : list) {
			reversedList.addFirst(item);
		}
		list.clear();
		list.addAll(reversedList);
	}
	
	public static void reverseArrayList(List<Integer> list){
		int start = 0;
		int end = list.size()-1;
		while(start<=end) {
			int temp;
			temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
	}
	
	public static void main(String []args) {
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5)); 
	
		 reverseLinkedList(linkedList);
		 reverseArrayList(arrayList);
		 
		System.out.println("Reverse ArrayList is: "+ arrayList);
		System.out.println("Reverse ArrayList by LinkedList is: " + linkedList);
		
	}
}
