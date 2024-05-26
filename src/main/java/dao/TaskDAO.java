package dao;
import model.Task;
import java.util.List;

public interface TaskDAO {

    void addTask(Task task);
    void updateTask(Task task);
    void deleteTask(Task task);
    Task getTask(int id);
    List<Task> getTasks();
}
