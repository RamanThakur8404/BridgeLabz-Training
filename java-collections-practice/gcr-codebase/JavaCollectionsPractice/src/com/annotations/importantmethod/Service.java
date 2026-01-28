package com.annotations.importantmethod;
public class Service {

    @ImportantMethod
    public void criticalTask() {}

    @ImportantMethod(level = "LOW")
    public void minorTask() {}

    public void normalTask() {}
}