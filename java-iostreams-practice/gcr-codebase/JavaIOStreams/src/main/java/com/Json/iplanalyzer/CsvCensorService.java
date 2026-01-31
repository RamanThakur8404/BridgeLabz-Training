package com.Json.iplanalyzer;

import java.io.*;

public class CsvCensorService {

    public static void censorCsv(String inputFile, String outputFile) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

        String header = br.readLine();
        bw.write(header);
        bw.newLine();

        String line;
        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            data[1] = CensorUtil.maskTeamName(data[1]);
            data[2] = CensorUtil.maskTeamName(data[2]);
            data[6] = CensorUtil.redactPlayer();

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
