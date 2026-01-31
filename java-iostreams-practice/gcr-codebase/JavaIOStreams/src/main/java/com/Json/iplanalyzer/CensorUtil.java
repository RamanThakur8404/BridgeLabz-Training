package com.Json.iplanalyzer;

public class CensorUtil {

    public static String maskTeamName(String teamName) {
        if (teamName == null || !teamName.contains(" ")) {
            return teamName;
        }
        return teamName.split(" ")[0] + " ***";
    }

    public static String redactPlayer() {
        return "REDACTED";
    }
}
