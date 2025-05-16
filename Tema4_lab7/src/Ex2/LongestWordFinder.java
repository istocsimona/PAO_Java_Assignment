package Ex2;

import java.io.*;

public class LongestWordFinder {
    public static String findLongestWord(String filename) throws IOException {
        String longest = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > longest.length()) {
                        longest = word;
                    }
                }
            }
        }
        return longest;
    }
}
