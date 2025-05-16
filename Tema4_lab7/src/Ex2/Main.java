package Ex2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file = "src/Ex2/input.txt";

        try {
            String longestWord = LongestWordFinder.findLongestWord(file);
            System.out.println("Longest word: " + longestWord);

            AppendClassToFile.appendClassToFile("DoubleCalculator.java", file);

            String[] lines = FileToArray.fileLinesToArray(file);
            System.out.println("File content:");
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


