package com.datastructure.linkedlist.singly.friendconnections;

public class SocialMediaService {
    private User head;

    public void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        newUser.next = head;
        head = newUser;
        System.out.println("User added successfully");
    }

    private User findUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        u1.friends = addFriendNode(u1.friends, id2);
        u2.friends = addFriendNode(u2.friends, id1);

        System.out.println("Friend connection added");
    }

    private FriendNode addFriendNode(FriendNode head, int id) {
        FriendNode newNode = new FriendNode(id);
        newNode.next = head;
        return newNode;
    }

    public void removeFriend(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        u1.friends = removeFriendNode(u1.friends, id2);
        u2.friends = removeFriendNode(u2.friends, id1);

        System.out.println("Friend connection removed");
    }

    private FriendNode removeFriendNode(FriendNode head, int id) {
        if (head == null)
            return null;

        if (head.friendId == id)
            return head.next;

        FriendNode temp = head;
        while (temp.next != null) {
            if (temp.next.friendId == id) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public void displayFriends(int id) {
        User user = findUser(id);
        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;
        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void searchById(int id) {
        User user = findUser(id);
        if (user != null)
            System.out.println("ID: " + user.userId + ", Name: " + user.name + ", Age: " + user.age);
        else
            System.out.println("User not found");
    }

    public void searchByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    public void countFriends() {
        User temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    public void findMutualFriends(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Mutual Friends: ");
        boolean found = false;

        FriendNode f1 = u1.friends;
        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.print("None");

        System.out.println();
    }
}
