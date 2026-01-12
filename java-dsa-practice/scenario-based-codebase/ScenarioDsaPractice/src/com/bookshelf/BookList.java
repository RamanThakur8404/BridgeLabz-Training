package com.bookshelf;

public class BookList {
	private Node head;
	public void add(Book book) {
		Node temp = head;
		Node newNode = new Node(book);
		if(head == null) {
			head = newNode;
			return;
		}
		else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	 public boolean remove(Book book) {

	        if (head == null) return false;

	        if (head.book.equals(book)) {
	            head = head.next;
	            return true;
	        }

	        Node prev = head;
	        Node curr = head.next;

	        while (curr != null) {
	            if (curr.book.equals(book)) {
	                prev.next = curr.next;
	                return true;
	            }
	            prev = curr;
	            curr = curr.next;
	        }
	        return false;
	    }
	 
	 public void display() {
		 Node temp = head;
		 while(temp != null) {
			 temp.book.diplayDetails();
			 temp = temp.next;
		 }
	 }
	 
	 public boolean isEmpty() {
		 return head == null;
	 }
}
