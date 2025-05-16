package Ex1;

import java.io.*;
import java.util.*;

import Ex1.Exceptii.*;

public class DoubleCalculator implements Calculator {
    @Override
    public double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if(a==null || b==null){
            throw new NullPointerException("Unul din parametrii este null");
        }
        double result = a+b;

        if (result == Double.POSITIVE_INFINITY){
            throw new OverflowException("Suma infinit pozitiva");
        }
        if( result == Double.NEGATIVE_INFINITY){
            throw new UnderflowException("Suma infinit negativa");
        }
        return result;
    }

    @Override
    public double divide(Double a, Double b) throws NullParameterException, MyArithmeticException {
        if (a == null || b == null) {
            throw new NullParameterException("Unul din parametri e null");
        }

        if (b == 0) {
            throw new MyArithmeticException("Impartire la zero");
        }

        return a / b;
    }

    @Override
    public double average(Double[] numbers) throws NullParameterException, OverflowException, UnderflowException, MyArithmeticException {
        if (numbers == null) {
            throw new NullParameterException("Vector null");
        }

        DoubleCalculator calculator = new DoubleCalculator();
        double sum = 0.0;

        for (Double number : numbers) {
            sum = calculator.add(sum, number);
        }

        return calculator.divide(sum, (double) numbers.length);
    }

    public Double[] readNumbersFromFile(String filename) throws FileProcessingException {
        List<Double> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Double.parseDouble(line.trim()));
            }
        } catch (IOException | NumberFormatException e) {
            throw new FileProcessingException("Eroare la citirea din fisier: " + filename);
        }

        return numbers.toArray(new Double[0]);
    }
}
