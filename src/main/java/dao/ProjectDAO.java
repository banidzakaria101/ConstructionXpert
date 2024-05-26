package dao;

import model.Project;

import java.sql.SQLException;
import java.util.List;

public interface ProjectDAO {

    void save(Project project) throws SQLException, ClassNotFoundException;
    void update(Project project) throws SQLException, ClassNotFoundException;;
    void delete(Project project) throws SQLException, ClassNotFoundException;;
    Project findById(int id) throws SQLException, ClassNotFoundException;
    List<Project> findAll() throws SQLException, ClassNotFoundException;
}
