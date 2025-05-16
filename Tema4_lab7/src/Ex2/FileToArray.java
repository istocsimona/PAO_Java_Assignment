package Ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileToArray {
    public static String[] fileLinesToArray(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines.toArray(new String[0]);
    }
}

