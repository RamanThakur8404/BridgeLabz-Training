package com.reflections.methodexecutiontime;

public class Task {
	
	    public void fastTask() {
	        for (int i = 0; i < 1000; i++);
	    }
	
	    public void slowTask() {
	        for (int i = 0; i < 1000000; i++);
	    }
}


