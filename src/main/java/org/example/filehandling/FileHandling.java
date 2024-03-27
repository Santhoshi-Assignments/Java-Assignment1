package org.example.filehandling;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class  FileHandling{

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\237765\\Downloads\\JavaAssignments\\json\\jsontext1\\inputfilejson.txt";
        String outputFile = "C:\\Users\\237765\\Downloads\\JavaAssignments\\json\\jsontext2\\outputfilejson.txt";

        modifyJSON(inputFile, outputFile);
    }

    public static void modifyJSON(String inputFile, String outputFile) {
        JSONParser parser = new JSONParser();

        try {
            Object o = parser.parse(new FileReader(inputFile));
            JSONObject jsonObject = (JSONObject) o;
            jsonObject.put("1", "Ramu");
            jsonObject.put("4", "Gourish");

            jsonObject.put("5", "Yogesh");
            jsonObject.put("6", "Manish");

            try (FileWriter fileWriter = new FileWriter(outputFile)) {
                fileWriter.write(jsonObject.toJSONString());
                System.out.println("JSON file is successfully modified and saved to " + outputFile);
            } catch (IOException e) {
                System.out.println("Error writing to the output file: " + e.getMessage());
            }

        } catch (IOException | ParseException e) {
            System.out.println("Error reading the JSON file: " + e.getMessage());
        }
    }
}

