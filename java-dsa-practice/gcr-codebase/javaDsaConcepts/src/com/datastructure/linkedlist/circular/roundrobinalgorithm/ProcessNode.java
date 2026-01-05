package com.datastructure.linkedlist.circular.roundrobinalgorithm;

public class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int waitingTime;
    int turnAroundTime;
    int priority;

    ProcessNode next;

    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
