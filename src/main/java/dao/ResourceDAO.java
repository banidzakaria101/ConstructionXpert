package dao;

import model.Resource;

import java.util.List;

public interface ResourceDAO {

        void create(Resource resource);
        void update(Resource resource);
        void delete(Resource resource);
        List<Resource> findAll();
        Resource findById(int id);
}
