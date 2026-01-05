package com.datastructure.linkedlist.singly.friendconnections;

import java.util.Scanner;

public class SocialMediaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SocialMediaService service = new SocialMediaService();

        while (true) {
            System.out.println("\n1.Add User\n2.Add Friend\n3.Remove Friend\n4.Display Friends");
            System.out.println("5.Search by ID\n6.Search by Name\n7.Mutual Friends\n8.Count Friends\n9.Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    service.addUser(id, name, age);
                    break;

                case 2:
                    System.out.print("Enter User1 ID: ");
                    int u1 = sc.nextInt();
                    System.out.print("Enter User2 ID: ");
                    int u2 = sc.nextInt();
                    service.addFriend(u1, u2);
                    break;

                case 3:
                    System.out.print("Enter User1 ID: ");
                    u1 = sc.nextInt();
                    System.out.print("Enter User2 ID: ");
                    u2 = sc.nextInt();
                    service.removeFriend(u1, u2);
                    break;

                case 4:
                    System.out.print("Enter User ID: ");
                    service.displayFriends(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter User ID: ");
                    service.searchById(sc.nextInt());
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    service.searchByName(sc.nextLine());
                    break;

                case 7:
                    System.out.print("Enter User1 ID: ");
                    u1 = sc.nextInt();
                    System.out.print("Enter User2 ID: ");
                    u2 = sc.nextInt();
                    service.findMutualFriends(u1, u2);
                    break;

                case 8:
                    service.countFriends();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
