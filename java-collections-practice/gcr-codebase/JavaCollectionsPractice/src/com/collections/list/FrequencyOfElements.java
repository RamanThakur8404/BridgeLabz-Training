package com.collections.list;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class FrequencyOfElements {
	
	public static Map<String, Integer> countFrequency(List<String> list){
		Map<String, Integer>map = new HashMap<>();
		for(String item : list) {
			map.put(item,map.getOrDefault(item,0)+1);
		}
		return map;
	}
	
	public static void main(String []args) {
		 List<String> list = List.of("apple", "banana", "apple", "orange");
	     Map<String, Integer> frequencyMap = countFrequency(list);
	     System.out.println(frequencyMap);
	}
}
