package Tema;

import java.util.Random;

public class RandomOutTask implements Task {
    private int number;

    public RandomOutTask() {
        this.number = new Random().nextInt(100);
    }

    @Override
    public void execute() {
        System.out.println("RandomOutTask: " + number);
    }
}
