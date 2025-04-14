package Tema;

public class StackContainer implements Container {
    private Task[] tasks;
    private int size;

    public StackContainer(int capacity) {
        tasks = new Task[capacity];
        size = 0;
    }

    @Override
    public void push(Task task) {
        if(size <tasks.length) {
            tasks[size++] = task;
        }
        else {
            System.out.println("Full stack");
        }
    }

    @Override
    public Task pop() {
        if (isEmpty()) return null;
        return tasks[--size];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
