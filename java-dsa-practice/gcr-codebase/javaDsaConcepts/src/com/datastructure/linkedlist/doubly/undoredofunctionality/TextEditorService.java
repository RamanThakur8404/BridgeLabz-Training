package com.datastructure.linkedlist.doubly.undoredofunctionality;

public class TextEditorService {
    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new text state
    public void addState(String text) {
        TextStateNode newNode = new TextStateNode(text);

        // If undo was used, clear redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = calculateSize();
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = newNode;
            size++;
        }

        // Maintain size limit
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }

        System.out.println("Text added");
    }

    // Undo
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed");
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed");
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display current text
    public void displayCurrent() {
        if (current == null) {
            System.out.println("Editor is empty");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }

    // Helper to recalculate size after redo cleanup
    private int calculateSize() {
        int count = 0;
        TextStateNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
