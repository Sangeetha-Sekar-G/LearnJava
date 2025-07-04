import java.io.*;
import java.util.HashSet;
import java.util.Set;

//javac FileComparator.java
//java FileComparator file1.txt file2.txt outputFile.txt

public class FileComparator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java FileComparator <file1> <file2> <outputFile>");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];
        String outputFile = args[2];

        try {
            Set<String> file2Contents = new HashSet<>();
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            String line;
            while ((line = br2.readLine()) != null) {
                file2Contents.add(line);
            }
            br2.close();

            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            while ((line = br1.readLine()) != null) {
                if (file2Contents.contains(line)) {
                    bw.write(line + "\tYES\n");
                } else {
                    bw.write(line + "\tNO\n");
                }
            }
            br1.close();
            bw.close();
            System.out.println("Comparison complete. Results written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}