package com.collections.map;

import java.util.*;

class Employee {
    String name, dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}

public class GroupByDept {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<Employee>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter department: ");
            String dept = sc.nextLine();

            list.add(new Employee(name, dept));
        }

        Map<String, List<Employee>> map = new HashMap<String, List<Employee>>();
        for (Employee e : list) {
            if (!map.containsKey(e.dept)) {
                map.put(e.dept, new ArrayList<Employee>());
            }
            map.get(e.dept).add(e);
        }

        // Print result
        System.out.println("\nEmployees grouped by department:");
        for (String dept : map.keySet()) {
            System.out.print(dept + ": ");
            for (Employee e : map.get(dept)) {
                System.out.print(e.name + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
