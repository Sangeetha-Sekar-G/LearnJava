// javac FileComparatorwithString.java
// java FileComparatorwithString file1.txt file2.txt output.txt
// It has file1 and file2 as input files, take one by one value from file1 -> check in file2, if it exist->prints column1 and respective column2,,  if it not exist->prints column1 and nothing,


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileComparatorwithString {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java FileComparator <file1> <file2> <outputFile>");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];
        String outputFile = args[2];

        try {
            // Build a map from file2: eventId -> associated string
            Map<String, String> file2Map = new HashMap<>();
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            String line;
            while ((line = br2.readLine()) != null) {
                String[] parts = line.split("\t", 2); // Assuming tab-separated values
                if (parts.length == 2) {
                    file2Map.put(parts[0].trim(), parts[1].trim());
                }
            }
            br2.close();

            // Read file1 and compare
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            while ((line = br1.readLine()) != null) {
                String eventId = line.trim();
                if (file2Map.containsKey(eventId)) {
                    bw.write(eventId + "\t" + file2Map.get(eventId) + "\t\n");
                } else {
                    bw.write(eventId + "\t\n");
                }
            }
            br1.close();
            bw.close();

            System.out.println("Comparison complete. Results written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error during file processing: " + e.getMessage());
        }
    }
}
