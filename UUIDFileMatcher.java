package com.example.databasesearch;

import java.io.*;
import java.nio.file.*;
import java.util.*;

//list of ids in input file
//directory which contains list of files
//prints output in file, id and filename

public class UUIDFileMatcher {
    public static void main(String[] args) {
        String uuidListFile = "C:\\Users\\ssekar\\Downloads\\demo\\demo\\src\\main\\java\\com\\example\\databasesearch\\uuids.txt"; // 📃 This file contains your input UUIDs
        String directoryPath = "C:\\AIRBNB SCRIPT\\monthlydo";   // 📁 Your local folder with text files
        String outputFileName = "C:\\AIRBNB SCRIPT\\matched_files.txt";

        try {
            // 🚀 Load UUIDs into a Set
            Set<String> uuidSet = new HashSet<>(Files.readAllLines(Paths.get(uuidListFile)));

            // 🔧 Prepare writer for output
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            File dir = new File(directoryPath);
            File[] files = dir.listFiles(file -> file.isFile()); // all files, excluding folders

            if (files != null) {
                for (File file : files) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            for (String uuid : uuidSet) {
                                if (line.contains(uuid)) {
                                    System.out.println(uuid + "\t" + file.getName());
                                    writer.write(uuid + "\t" + file.getName());
                                    writer.newLine();
                                }
                            }
                        }
                    }
                }
            }

            writer.close();
            System.out.println("✅ Finished! Matches written to: " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
