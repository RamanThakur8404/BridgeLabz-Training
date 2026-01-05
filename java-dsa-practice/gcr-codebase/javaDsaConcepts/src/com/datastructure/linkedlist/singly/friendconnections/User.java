package com.datastructure.linkedlist.singly.friendconnections;

public class User {
	 protected int userId;
	 protected String name;
	 protected int age;
	 protected FriendNode friends;
	 protected User next;

	    User(int userId, String name, int age) {
	        this.userId = userId;
	        this.name = name;
	        this.age = age;
	        this.friends = null;
	        this.next = null;
	    }
}
