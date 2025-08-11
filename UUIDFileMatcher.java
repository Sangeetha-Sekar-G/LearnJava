import java.io.*;
import java.nio.file.*;
import java.util.*;

public class UUIDFileMatcher {
    public static void main(String[] args) {
        String uuidListFile = "uuids.txt"; // 📃 This file contains your input UUIDs
        String directoryPath = "./data";   // 📁 Your local folder with text files
        String outputFileName = "matched_files.txt";

        try {
            // ✅ Load all UUIDs into a set for quick lookup
            Set<String> uuidSet = new HashSet<>(Files.readAllLines(Paths.get(uuidListFile)));

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            // 🚀 Loop through files in the directory
            File dir = new File(directoryPath);
            File[] files = dir.listFiles((d, name) -> name.endsWith(".txt")); // Adjust extension if needed

            if (files != null) {
                for (File file : files) {
                    boolean found = false;
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            for (String uuid : uuidSet) {
                                if (line.contains(uuid)) {
                                    found = true;
                                    break;
                                }
                            }
                            if (found) break;
                        }
                    }
                    if (found) {
                        writer.write(file.getName());
                        writer.newLine();
                    }
                }
            }

            writer.close();
            System.out.println("Matching filenames written to " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
