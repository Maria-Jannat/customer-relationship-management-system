package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.ITaskController;
import com.cesurazure.crm.model.Task;
import com.cesurazure.crm.service.impl.ICRMUserService;
import com.cesurazure.crm.service.impl.ILeadService;
import com.cesurazure.crm.service.impl.ITaskService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TaskController implements ITaskController {

    @Autowired
    ITaskService taskService;

    @Autowired
    ILeadService leadService;

    @Autowired
    ICRMUserService crmuserService;

    @Override
    @RequestMapping(value = "/taskSave")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");
        taskService.save(request);
        return new ModelAndView("redirect:/taskcreate");
    }

    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping(value = "/taskupdate")
    public ModelAndView update(HttpServletRequest request) {
        taskService.updateStatus(request);
        return null;
    }

    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Task> getAll() {
        List<Task> taskList = taskService.getAll();
        return taskList;
    }

}
