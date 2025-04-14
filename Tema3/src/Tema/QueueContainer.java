package Tema;

public class QueueContainer implements Container{
    private Task[] tasks;
    private int head;
    private int tail;
    private int size;

    public QueueContainer(int capacity) {
        tasks = new Task[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    @Override
    public void push(Task task) {
        if (size < tasks.length) {
            tasks[tail] = task;
            tail = (tail + 1) % tasks.length;
            size++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    @Override
    public Task pop() {
        if (isEmpty()) return null;
        Task task = tasks[head];
        head = (head + 1) % tasks.length;
        size--;
        return task;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
