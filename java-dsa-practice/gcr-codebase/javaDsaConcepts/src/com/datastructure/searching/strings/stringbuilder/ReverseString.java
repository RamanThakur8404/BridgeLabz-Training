package com.datastructure.searching.strings.stringbuilder;

import java.util.Scanner;

public class ReverseString {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = scanner.next();
		
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(str);
		
		strBuilder.reverse();
		System.out.println("Reverse String: " + strBuilder.toString());
		
		
	}
}
