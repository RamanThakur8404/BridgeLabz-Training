package com.annotations.maxlength;
public class MaxLengthAnnotationExample {
    public static void main(String[] args) {

        User u1 = new User("Emma");           // valid
        System.out.println(u1.getUsername());

        User u2 = new User("VeryLongUsername");  // exception
        System.out.println(u2.getUsername());
    }
}