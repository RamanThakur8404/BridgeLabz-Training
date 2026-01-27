package com.Junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskManagerTest {

    TaskManager manager = new TaskManager();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // 2 seconds
    void testLongRunningTaskPerformance() throws InterruptedException {
        manager.longRunningTask();
    }
}
