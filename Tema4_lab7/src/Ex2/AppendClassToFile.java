package Ex2;

import java.io.*;

public class AppendClassToFile {
    public static void appendClassToFile(String classFilename, String targetFilename) throws IOException {
        try (BufferedReader classReader = new BufferedReader(new FileReader(classFilename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilename, true))) {
            String line;
            writer.write("\n// --- start ---\n");
            while ((line = classReader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.write("// --- end ---\n");
        }
    }
}
