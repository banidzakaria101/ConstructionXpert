package DAOImpliment;

import Dbconnection.dbConnection;
import dao.ProjectDAO;
import model.Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectIMP implements ProjectDAO {

    @Override
    public void save(Project project) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO project (projectName, projectDescription, projectStartDate, projectEndDate, projectBudget) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement stm = connection.prepareStatement(sql)) {
            stm.setString(1, project.getProjectName());
            stm.setString(2, project.getProjectDescription());
            stm.setDate(3, project.getProjectStartDate());
            stm.setDate(4, project.getProjectEndDate());
            stm.setInt(5, project.getProjectBudget());
            stm.executeUpdate();

        }
    }

    public void update(Project project) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE project SET projectName=?, projectDescription=?, projectStartDate=?, projectEndDate=?, projectBudget=? WHERE projectId=?";
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement stm = connection.prepareStatement(sql)) {
            stm.setString(1, project.getProjectName());
            stm.setString(2, project.getProjectDescription());
            stm.setDate(3, project.getProjectStartDate());
            stm.setDate(4, project.getProjectEndDate());
            stm.setInt(5, project.getProjectBudget());
            stm.setInt(6, project.getProjectId());
            stm.executeUpdate();
        }
    }


    @Override
    public void delete(Project project) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM project WHERE projectId=?";
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement stm = connection.prepareStatement(sql)) {
            stm.setInt(1, project.getProjectId());
            stm.executeUpdate();
        }
    }

    @Override
    public Project findById(int id) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM project WHERE projectId = ?";
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement stm = connection.prepareStatement(sql)) {
            stm.setInt(1, id);
            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {
                    Project project = new Project();
                    project.setProjectId(rs.getInt("projectId"));
                    project.setProjectName(rs.getString("projectName"));
                    project.setProjectDescription(rs.getString("projectDescription"));
                    project.setProjectStartDate(rs.getDate("projectStartDate"));
                    project.setProjectEndDate(rs.getDate("projectEndDate"));
                    project.setProjectBudget(rs.getInt("projectBudget"));
                    return project;
                }
            }
        }
        return null;
    }


    @Override
    public List<Project> findAll() throws SQLException, ClassNotFoundException {
        List<Project> projects = new ArrayList<>();
        String sql = "SELECT * FROM project ORDER BY projectId ASC";
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                Project project = new Project();
                project.setProjectId(rs.getInt("projectId"));
                project.setProjectName(rs.getString("projectName"));
                project.setProjectDescription(rs.getString("projectDescription"));
                project.setProjectStartDate(rs.getDate("projectStartDate"));
                project.setProjectEndDate(rs.getDate("projectEndDate"));
                project.setProjectBudget(rs.getInt("projectBudget"));
                projects.add(project);
            }
        }
        return projects;
    }


}
