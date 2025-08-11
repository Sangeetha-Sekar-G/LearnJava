import java.io.*;
import java.util.*;

public class FileStringSearch {
    public static void main(String[] args) {
        String searchString = "your_search_term"; // 🔍 Change this to your search term
        List<String> fileList = Arrays.asList("file1.txt", "file2.txt", "file3.txt"); // 📄 Replace with your files
        String outputFileName = "matched_files.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String fileName : fileList) {
                File file = new File(fileName);
                if (!file.exists()) {
                    System.out.println("File not found: " + fileName);
                    continue;
                }
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    boolean found = false;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(searchString)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        writer.write(fileName);
                        writer.newLine();
                    }
                }
            }
            System.out.println("Matching files written to: " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
