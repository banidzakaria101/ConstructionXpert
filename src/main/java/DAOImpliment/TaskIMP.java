package DAOImpliment;

import Dbconnection.dbConnection;
import dao.TaskDAO;
import model.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TaskIMP implements TaskDAO {


    @Override
    public void addTask(Task task) {
        String INSERT_TASK_SQL = "INSERT INTO tasks (taskName, taskDescription, taskStatus, taskStartDate, taskEndDate) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TASK_SQL)) {
            preparedStatement.setString(1, task.getTaskName());
            preparedStatement.setString(2, task.getTaskDescription());
            preparedStatement.setString(3, task.getTaskStatus());
            preparedStatement.setDate(4, task.getTaskdStartDate());
            preparedStatement.setDate(5, task.getTaskdEndDate());

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateTask(Task task) {
        // Implement update logic
    }

    @Override
    public void deleteTask(Task task) {
        // Implement delete logic
    }

    @Override
    public Task getTask(int id) {
        // Implement get logic
        return null;
    }

    @Override
    public List<Task> getTasksByProjectId(int projectId) {
        // Implement get tasks by project ID logic
        return List.of();
    }
}
