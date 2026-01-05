package com.datastructure.linkedlist.circular.roundrobinalgorithm;

import java.util.Scanner;

public class RoundRobinMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time Quantum: ");
        int tq = sc.nextInt();

        RoundRobinScheduler scheduler = new RoundRobinScheduler(tq);

        while (true) {
            System.out.println("\n1.Add Process");
            System.out.println("2.Display Processes");
            System.out.println("3.Execute Scheduling");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Process ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Burst Time: ");
                    int bt = sc.nextInt();
                    System.out.print("Priority: ");
                    int pr = sc.nextInt();
                    scheduler.addProcess(pid, bt, pr);
                    break;

                case 2:
                    scheduler.displayProcesses();
                    break;

                case 3:
                    scheduler.executeProcesses();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
