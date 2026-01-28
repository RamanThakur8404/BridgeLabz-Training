package com.annotations.logexecutiontime;
public class TaskService {

    @LogExecutionTime
    public void fastTask() throws InterruptedException {
        Thread.sleep(200);
    }

    @LogExecutionTime
    public void slowTask() throws InterruptedException {
        Thread.sleep(800);
    }
}