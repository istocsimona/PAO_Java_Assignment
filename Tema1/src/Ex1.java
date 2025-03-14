import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, n = 0;
        int[] vector = new int[100];

        // Continuously read numbers until an invalid input is given
        while (true) {
            System.out.print("Enter a number (0-5): ");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                switch (number) {
                    case 0: case 1: case 2: case 3: case 4: case 5:
                        System.out.println("You entered: " + number);
                        vector[n] = number;
                        n++;
                        break;
                    default:
                        System.out.println("Invalid number! Exiting...");
                        scanner.close();

                        // Print only the filled part of the vector
                        int[] validNumbers = Arrays.copyOf(vector, n);
                        System.out.println("Vector: " + Arrays.toString(validNumbers));

                        // Reverse only the filled part
                        for (int j = 0; j < n / 2; j++) {
                            int temp = validNumbers[j];
                            validNumbers[j] = validNumbers[n - 1 - j];
                            validNumbers[n - 1 - j] = temp;
                        }

                        System.out.println("Inversed vector: " + Arrays.toString(validNumbers));
                        return;
                }
            } else {
                System.out.println("Invalid input! Exiting...");
                scanner.close();
                return;
            }
        }
    }
}
