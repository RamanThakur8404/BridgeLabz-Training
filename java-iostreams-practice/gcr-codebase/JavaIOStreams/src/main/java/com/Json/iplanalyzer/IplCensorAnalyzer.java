package com.Json.iplanalyzer;

public class IplCensorAnalyzer {

    public static void main(String[] args) throws Exception {

        JsonCensorService.censorJson(
                "src/main/java/com/Json/iplanalyzer/ipl.json",
                "src/main/java/com/Json/iplanalyzer/ipl_censored.json"
        );

        CsvCensorService.censorCsv(
                "src/main/java/com/Json/iplanalyzer/ipl.csv",
                "src/main/java/com/Json/iplanalyzer/ipl_censored.csv"
        );

        System.out.println(" IPL data censored successfully");
    }
}
