package com.Json.iplanalyzer;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

import java.io.File;
import java.io.IOException;

public class JsonCensorService {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static void censorJson(String inputFile, String outputFile) throws IOException {

        ArrayNode matches = (ArrayNode) mapper.readTree(new File(inputFile));

        for (JsonNode match : matches) {
            ObjectNode obj = (ObjectNode) match;

            String team1 = obj.get("team1").asText();
            String team2 = obj.get("team2").asText();

            obj.put("team1", CensorUtil.maskTeamName(team1));
            obj.put("team2", CensorUtil.maskTeamName(team2));
            obj.put("player_of_match", CensorUtil.redactPlayer());

            ObjectNode score = (ObjectNode) obj.get("score");
            ObjectNode newScore = mapper.createObjectNode();

            score.fields().forEachRemaining(entry -> {
                newScore.put(
                        CensorUtil.maskTeamName(entry.getKey()),
                        entry.getValue().asInt()
                );
            });

            obj.set("score", newScore);
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(outputFile), matches);
    }
}
