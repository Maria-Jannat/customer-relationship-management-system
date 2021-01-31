package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.ITaskDAO;
import com.cesurazure.crm.model.Task;
import com.cesurazure.crm.service.impl.ITaskService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "taskService")
public class TaskService implements ITaskService {
    
    @Autowired
    ITaskDAO taskDAO;
    
    @Override
    public Task save(HttpServletRequest request) {
        Task task = new Task();
        task.setTaskOwner(request.getParameter("crmFirstName"));
        task.setTaskSubject(request.getParameter("taskSubject"));
        task.setTaskDueDate(request.getParameter("taskDueDate"));
        task.setRelatedPerson(request.getParameter("leadFirstName"));
        task.setTaskStatus(request.getParameter("taskStatus"));
        task.setTaskPriority(request.getParameter("taskPriority"));
        task.setTaskDescription(request.getParameter("taskDescription"));
        
        System.out.println("*************" + task.getTaskSubject());
        System.out.println("*************" + task.getTaskOwner());
        System.out.println("*************" + task.getRelatedPerson());
        
        taskDAO.save(task);
        return task;
    }
    
    @Override
    public Task update(HttpServletRequest request) {
        Task task = new Task();
        task.setId(Integer.parseInt(request.getParameter("id")));
        task.setTaskOwner(request.getParameter("taskOwner"));
        task.setTaskSubject(request.getParameter("taskSubject"));
        task.setTaskDueDate(request.getParameter("taskDueDate"));
        task.setRelatedPerson(request.getParameter("relatedPerson"));
        task.setTaskStatus(request.getParameter("taskStatus"));
        task.setTaskPriority(request.getParameter("taskPriority"));
        task.setTaskDescription(request.getParameter("taskDescription"));
        
        taskDAO.update(task);
        return task;
        
    }
    
    @Override
    public Task updateStatus(HttpServletRequest request) {
        Task t = taskDAO.getById(Integer.parseInt(request.getParameter("id")));
        t.setId(Integer.parseInt(request.getParameter("id")));
        System.out.println(".//////////  .    .. " + Integer.parseInt(request.getParameter("id")));
        t.setTaskStatus("Done");
        return taskDAO.updateStatus(t);
    }
    
    @Override
    public Task delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Task> getAll() {
        return taskDAO.getAll();
    }
    
    @Override
    public Task getById(int id) {
        return taskDAO.getById(id);
    }
    
}
