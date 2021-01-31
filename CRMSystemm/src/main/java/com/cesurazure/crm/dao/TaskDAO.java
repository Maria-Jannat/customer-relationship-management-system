package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.ITaskDAO;
import com.cesurazure.crm.model.Task;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "taskDAO")
@Transactional
public class TaskDAO implements ITaskDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Task save(Task t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Task update(Task t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Task delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Task> getAll() {
        List<Task> taskList = sessionFactory.getCurrentSession().createCriteria(Task.class).list();
        sessionFactory.getCurrentSession().flush();
        return taskList;
    }

    @Override
    public Task getById(int id) {
        Task task = (Task) sessionFactory.getCurrentSession().get(Task.class, id);
        sessionFactory.getCurrentSession().flush();
        return task;
    }

    @Override
    public Task updateStatus(Task t) {
       sessionFactory.getCurrentSession().saveOrUpdate(t);
       sessionFactory.getCurrentSession().flush();
        return new Task();
    }

}
