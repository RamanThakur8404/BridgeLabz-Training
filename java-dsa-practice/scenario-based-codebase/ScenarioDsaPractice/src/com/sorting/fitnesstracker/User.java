package com.sorting.fitnesstracker;
import java.util.*;

class User {
   private String name;
   private int steps;

    User(String name, int steps) {
        this.name = name;
        this.steps = steps;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getSteps() {
    	return steps;
    }
    
    @Override
    public String toString() {
    	return name + " ---> " + steps;
    }
}

