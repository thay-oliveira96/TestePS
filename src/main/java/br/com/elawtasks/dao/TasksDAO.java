package br.com.elawtasks.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.elawtasks.entity.Tasks;

@Repository
public class TasksDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void createTask(Tasks tasks) {
        entityManager.persist(tasks);
    }

    public Tasks readTask(long taskId) {
        return entityManager.find(Tasks.class, taskId);
    }

    public void updateTask(Tasks tasks) {
        entityManager.merge(tasks);
    }

    public void deleteTask(Tasks tasks) {
        entityManager.remove(entityManager.contains(tasks) ? tasks : entityManager.merge(tasks));
    }
    
    public List<Tasks> listar() {
        return entityManager.createQuery("FROM Tasks", Tasks.class).getResultList();
    }

}
