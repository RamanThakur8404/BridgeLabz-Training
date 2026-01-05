package com.datastructure.linkedlist.circular.roundrobinalgorithm;

public class RoundRobinScheduler {
    private ProcessNode tail;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
        this.tail = null;
    }

    // Add process at end
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (tail == null) {
            tail = newNode;
            tail.next = tail; // circular
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Process added");
    }

    // Display processes
    public void displayProcesses() {
        if (tail == null) {
            System.out.println("No processes in queue");
            return;
        }

        ProcessNode temp = tail.next;
        System.out.println("Process Queue:");
        do {
            System.out.println("PID: " + temp.pid +
                    ", Remaining Time: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != tail.next);
    }

    // Simulate Round Robin Scheduling
    public void executeProcesses() {
        if (tail == null) {
            System.out.println("No processes to execute");
            return;
        }

        int currentTime = 0;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int completed = 0;

        ProcessNode current = tail.next;
        ProcessNode prev = tail;

        while (tail != null) {
            if (current.remainingTime > 0) {

                if (current.remainingTime > timeQuantum) {
                    currentTime += timeQuantum;
                    current.remainingTime -= timeQuantum;
                } else {
                    currentTime += current.remainingTime;
                    current.remainingTime = 0;

                    current.turnAroundTime = currentTime;
                    current.waitingTime =
                            current.turnAroundTime - current.burstTime;

                    totalWaitingTime += current.waitingTime;
                    totalTurnAroundTime += current.turnAroundTime;
                    completed++;

                    // Remove completed process
                    if (current == prev) {
                        tail = null;
                    } else {
                        prev.next = current.next;
                        if (current == tail)
                            tail = prev;
                    }

                    current = prev.next;
                    continue;
                }
            }

            prev = current;
            current = current.next;

            displayProcesses();
        }

        System.out.println("\nAll processes completed");
        System.out.println("Average Waiting Time: "
                + (double) totalWaitingTime / completed);
        System.out.println("Average Turnaround Time: "
                + (double) totalTurnAroundTime / completed);
    }
}
