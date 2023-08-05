package org.example;

import java.io.*;
import java.util.*;

public class TestFile {
    public static void getWordsInMap(String fileName, Map<String, Integer> map) {
        System.out.println("Going to parse file");
        File file = new File(fileName);
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (input.hasNext()) {
            String word = input.next();
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println("All word stored to map with count");

        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

    }

    public static void writeWordCountToFile(String outFileName, Map<String, Integer> map) throws IOException {
        System.out.println("GOing to write words count in file");
        ArrayList<String> sortedWordsArr = new ArrayList<String>(map.keySet());
        Collections.sort(sortedWordsArr);
        BufferedWriter out = new BufferedWriter(new FileWriter(outFileName));

        Collections.sort(sortedWordsArr);

        for (String key : sortedWordsArr) {
            String outputLine = key + ": " + map.get(key);
            out.write(outputLine);
            out.newLine();
        }
        out.close();
        System.out.println("Word count written to file");

    }

    public static void main(String[] args) throws IOException {
        String inputFileName = "input";
//        String outputFileName = args[1];
        Map<String, Integer> map = new HashMap<>();
        getWordsInMap(inputFileName, map);
//        writeWordCountToFile(outputFileName, map);
    }
}
