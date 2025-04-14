package Tema;

public interface Container {
    void push(Task task);
    Task pop();
    boolean isEmpty();
}
