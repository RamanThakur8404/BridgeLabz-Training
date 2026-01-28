package com.reflections.apikey;
public class Configuration {

    private static String API_KEY = "OLD_KEY";

    public static void showKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}