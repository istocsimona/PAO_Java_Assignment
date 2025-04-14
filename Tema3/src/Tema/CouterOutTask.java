package Tema;

public class CouterOutTask implements Task{
    private static int counter = 0;

    @Override
    public void execute() {
        counter++;
        System.out.println("OutTask: " + counter);
    }
}
