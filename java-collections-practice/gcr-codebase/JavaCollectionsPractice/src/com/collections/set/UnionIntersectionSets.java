package com.collections.set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersectionSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> setFirst = new HashSet<>();
        Set<Integer> setSecond = new HashSet<>();

        System.out.print("Enter number of elements in Set 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of Set 1:");
        for (int i = 0; i < n1; i++) {
            setFirst.add(sc.nextInt());
        }

        System.out.print("Enter number of elements in Set 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of Set 2:");
        for (int i = 0; i < n2; i++) {
            setSecond.add(sc.nextInt());
        }

        // Union
        Set<Integer> union = new HashSet<>(setFirst);
        union.addAll(setSecond);

        // Intersection
        Set<Integer> intersection = new HashSet<>(setFirst);
        intersection.retainAll(setSecond);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}