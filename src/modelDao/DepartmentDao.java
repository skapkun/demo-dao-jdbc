package modelDao;

import java.util.List;

import modelEntities.Department;

public interface DepartmentDao {
    void insert (Department obj);//responsável por inserir objeto
    void update(Department obj);
    void deleteById (Integer id);
    Department findById (Integer id);
    List<Department> findAll();
    
}
