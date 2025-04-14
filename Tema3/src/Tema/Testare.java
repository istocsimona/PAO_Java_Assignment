package Tema;

public class Testare {
    public static void main(String[] args) {
        Task[] tasks = new Task[4];

        tasks[0] = new OutTask("Hello, world!");
        tasks[1] = new RandomOutTask();
        tasks[2] = new CouterOutTask(); // corectat numele clasei
        tasks[3] = new CouterOutTask();

        System.out.println("--- STACK CONTAINER ---");
        Container stack = new StackContainer(10);
        for(Task task : tasks) {
            stack.push(task);
        }
        while (!stack.isEmpty()) {
            Task t = stack.pop();
            t.execute();
        }



        System.out.println("\n--- QUEUE CONTAINER ---");
        Container queue = new QueueContainer(10);
        for(Task task : tasks) {
            queue.push(task);
        }
        while (!queue.isEmpty()) {
            Task t = queue.pop();
            t.execute();
        }
    }
}
