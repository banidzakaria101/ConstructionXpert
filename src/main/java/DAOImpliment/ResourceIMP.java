package DAOImpliment;

import Dbconnection.dbConnection;
import dao.ResourceDAO;
import model.Resource;

import java.sql.*;
import java.util.List;
public class ResourceIMP implements ResourceDAO {
    @Override
    public void create(Resource resource) { ;

    }

    @Override
    public void update(Resource resource) {

    }

    @Override
    public void delete(Resource resource) {

    }

    @Override
    public List<Resource> findAll() {
        return List.of();
    }

    @Override
    public Resource findById(int id) {
        return null;
    }
}
