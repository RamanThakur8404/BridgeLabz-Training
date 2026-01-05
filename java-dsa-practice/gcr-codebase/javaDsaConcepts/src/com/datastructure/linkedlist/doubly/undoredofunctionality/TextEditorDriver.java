package com.datastructure.linkedlist.doubly.undoredofunctionality;
import java.util.Scanner;
public class TextEditorDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditorService editor = new TextEditorService();

        while (true) {
            System.out.println("\n1.Type Text");
            System.out.println("2.Undo");
            System.out.println("3.Redo");
            System.out.println("4.Display Current Text");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    editor.addState(sc.nextLine());
                    break;

                case 2:
                    editor.undo();
                    break;

                case 3:
                    editor.redo();
                    break;

                case 4:
                    editor.displayCurrent();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
