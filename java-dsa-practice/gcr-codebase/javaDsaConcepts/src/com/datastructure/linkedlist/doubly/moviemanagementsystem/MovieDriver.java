package com.datastructure.linkedlist.doubly.moviemanagementsystem;

import java.util.Scanner;
public class MovieDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieService service = new MovieService();

        while (true) {
            System.out.println("\n1.Add at Beginning\n2.Add at End\n3.Add at Position");
            System.out.println("4.Remove by Title\n5.Search by Director\n6.Search by Rating");
            System.out.println("7.Display Forward\n8.Display Reverse\n9.Update Rating\n10.Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Director: ");
                    String d = sc.nextLine();
                    System.out.print("Year: ");
                    int y = sc.nextInt();
                    System.out.print("Rating: ");
                    double r = sc.nextDouble();
                    service.addAtBeginning(t, d, y, r);
                    break;

                case 2:
                    System.out.print("Title: ");
                    t = sc.nextLine();
                    System.out.print("Director: ");
                    d = sc.nextLine();
                    System.out.print("Year: ");
                    y = sc.nextInt();
                    System.out.print("Rating: ");
                    r = sc.nextDouble();
                    service.addAtEnd(t, d, y, r);
                    break;

                case 3:
                    System.out.print("Position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    t = sc.nextLine();
                    System.out.print("Director: ");
                    d = sc.nextLine();
                    System.out.print("Year: ");
                    y = sc.nextInt();
                    System.out.print("Rating: ");
                    r = sc.nextDouble();
                    service.addAtPosition(pos, t, d, y, r);
                    break;

                case 4:
                    System.out.print("Enter Title: ");
                    service.removeByTitle(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Director: ");
                    service.searchByDirector(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Rating: ");
                    service.searchByRating(sc.nextDouble());
                    break;

                case 7:
                    service.displayForward();
                    break;

                case 8:
                    service.displayReverse();
                    break;

                case 9:
                    System.out.print("Title: ");
                    t = sc.nextLine();
                    System.out.print("New Rating: ");
                    r = sc.nextDouble();
                    service.updateRating(t, r);
                    break;

                case 10:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
