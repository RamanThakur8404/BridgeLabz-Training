package com.binarysearchtree.universitydigitalrecordsystem;
import java.util.Scanner;

public class UniversityBST {

    // Insert
    static Student insert(Student root, int rollNo, String name) {
        if (root == null) return new Student(name,rollNo);
        if (rollNo < root.rollNo)
            root.left = insert(root.left, rollNo, name);
        else if (rollNo > root.rollNo)
            root.right = insert(root.right, rollNo, name);
        return root;
    }

    // Search
    static Student search(Student root, int rollNo) {
        if (root == null || root.rollNo == rollNo) return root;
        if (rollNo < root.rollNo) return search(root.left, rollNo);
        return search(root.right, rollNo);
    }

    // Find minimum (for delete)
    static Student minValue(Student node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Delete
    static Student delete(Student root, int rollNo) {
        if (root == null) return null;

        if (rollNo < root.rollNo)
            root.left = delete(root.left, rollNo);
        else if (rollNo > root.rollNo)
            root.right = delete(root.right, rollNo);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            Student successor = minValue(root.right);
            root.rollNo = successor.rollNo;
            root.name = successor.name;
            root.right = delete(root.right, successor.rollNo);
        }
        return root;
    }

    // Inorder (sorted display)
    static void inorder(Student root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println("rollNo: " + root.rollNo + ", Name: " + root.name);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student root = null;

        while (true) {
            System.out.println("\n1.Insert  2.Delete  3.Search  4.Display(Sorted)  5.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter rollNo: ");
                    int r = sc.nextInt();
                    System.out.print("Enter name: ");
                    String n = sc.next();
                    root = insert(root, r, n);
                    System.out.println("Inserted Successfully");
                    break;

                case 2:
                    System.out.print("Enter rollNo to delete: ");
                    root = delete(root, sc.nextInt());
                    System.out.println("Deleted Successfully");
                    break;

                case 3:
                    System.out.print("Enter rollNo to search: ");
                    Student s = search(root, sc.nextInt());
                    if (s != null)
                        System.out.println("Found: " + s.name);
                    else
                        System.out.println("Record not found");
                    break;

                case 4:
                    System.out.println("Student Records (Sorted by rollNo):");
                    inorder(root);
                    break;

                case 5:
                    return;
            }
        }
    }
}