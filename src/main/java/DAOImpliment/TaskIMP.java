package DAOImpliment;

import Dbconnection.dbConnection;
import dao.TaskDAO;
import model.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskIMP implements TaskDAO {


    @Override
    public void addTask(Task task) {
        String INSERT_TASK_SQL = "INSERT INTO tasks (taskProjectId, taskName, taskDescription, taskStatus, taskStartDate, taskEndDate) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TASK_SQL)) {
            preparedStatement.setInt(1, task.getTaskProjectId());
            preparedStatement.setString(2, task.getTaskName());
            preparedStatement.setString(3, task.getTaskDescription());
            preparedStatement.setString(4, task.getTaskStatus());
            preparedStatement.setDate(5, task.getTaskdStartDate());
            preparedStatement.setDate(6, task.getTaskdEndDate());

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
        return null;
    }

    @Override
    public List<Task> getAllTasks(int projectId) {
        List<Task> tasks = new ArrayList<>();
        String SELECT_TASKS_SQL = "SELECT * FROM tasks WHERE taskProjectId = ?";
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TASKS_SQL)) {
            preparedStatement.setInt(1, projectId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Task task = new Task();
                task.setTaskId(resultSet.getInt("taskId"));
                task.setTaskProjectId(resultSet.getInt("taskProjectId"));
                task.setTaskName(resultSet.getString("taskName"));
                task.setTaskDescription(resultSet.getString("taskDescription"));
                task.setTaskStatus(resultSet.getString("taskStatus"));
                task.setTaskdStartDate(resultSet.getDate("taskStartDate"));
                task.setTaskdEndDate(resultSet.getDate("taskEndDate"));
                tasks.add(task);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tasks;
    }

}
