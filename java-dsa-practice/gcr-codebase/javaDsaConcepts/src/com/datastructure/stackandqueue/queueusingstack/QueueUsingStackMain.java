package com.datastructure.stackandqueue.queueusingstack;

import java.util.Scanner;

public class QueueUsingStackMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueUsingStack q = new QueueUsingStack();

        int choice;

        do {
            System.out.println("\n--- Queue Using Stack Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    System.out.println(value + " enqueued");
                    break;

                case 2:
                    System.out.println("Dequeued element: " + q.dequeue());
                    break;

                case 3:
                    System.out.println("Front element: " + q.peek());
                    break;
                
                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
