package com.collections.queue;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // push element
    void push(int x) {
        queue2.add(x);
        while (!queue1.isEmpty())
            queue2.add(queue1.remove());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // pop element
    int pop() {
        return queue1.remove();
    }

    int top() {
        return queue1.peek();
    }

    public static void main(String[] args) {
        StackUsingQueues s = new StackUsingQueues();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
    }
}