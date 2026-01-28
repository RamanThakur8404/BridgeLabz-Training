package com.annotations.deprecated;
public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature (Do not use)");
    }

    public void newFeature() {
        System.out.println("New improved feature");
    }
}