package Ex1;

public class Client {
    public static void main(String[] args) {
        DoubleCalculator calc = new DoubleCalculator();

        // Test add cu null
        try {
            calc.add(null, 5.0);
        } catch (Exception e) {
            System.out.println("Expected: " + e);
        }

        // Test add overflow
        try {
            calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Expected: " + e);
        }

        // Test add underflow (Negative Infinity)
        try {
            calc.add(-Double.MAX_VALUE, -Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Expected: " + e);
        }

        // Test divide by zero
        try {
            calc.divide(5.0, 0.0);
        } catch (Exception e) {
            System.out.println("Expected: " + e);
        }

        // Test average cu fisier

        try {
            Double[] values = calc.readNumbersFromFile("inexistent.txt");
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }

        //teste ok
        try {
            Double[] values = calc.readNumbersFromFile("src/Ex1/input.txt");
            double avg = calc.average(values);
            System.out.println("Media valorilor din fisier este: " + avg);
            System.out.println(calc.add(2.0, 5.31));
            System.out.println(calc.divide(5.14, 2.141));
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }
    }
}
