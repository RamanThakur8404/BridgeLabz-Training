package com.datastructure.searching.strings.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = scanner.next();
		
		StringBuilder strBuilder = new StringBuilder();
		HashSet<Character> hashset = new HashSet<>();
		
		for(char ch: str.toCharArray()) {
			if(!hashset.contains(ch)){				
				hashset.add(ch);
				strBuilder.append(ch);
			}
		}
		System.out.println("Remove Duplicate than output string is: " + strBuilder.toString());
	}
}
