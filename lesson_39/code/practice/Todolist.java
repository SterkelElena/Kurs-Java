package practice;

public interface Todolist {
    boolean addTask(Task task);
    void viewAllTasks();
    void deleteTask(int taskNumber);
    void printMenu();
}
