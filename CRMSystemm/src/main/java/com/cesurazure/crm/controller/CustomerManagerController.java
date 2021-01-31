package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.ICustomerManagerController;
import com.cesurazure.crm.model.Business;
import com.cesurazure.crm.model.CRMUser;
import com.cesurazure.crm.model.CustomerManager;
import com.cesurazure.crm.service.impl.ICustomerManagerService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomerManagerController implements ICustomerManagerController {

    @Autowired
    ICustomerManagerService customerManagerService;

    @RequestMapping(value = "/cm-create")
    public ModelAndView create() {
        return new ModelAndView("independent-entity/cm/cm_create");
    }

    @RequestMapping(value = "/cm-report")
    public ModelAndView report() {
        List<CustomerManager> customerManagersList = customerManagerService.getAll();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("customerManagersList", customerManagersList);
        return new ModelAndView("independent-entity/cm/cm_report", "map", map);
    }

    @Override
    @RequestMapping(value = "/cm-save")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");

        customerManagerService.save(request);
        return new ModelAndView("independent-entity/cm/cm_create");
    }

    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerManager> getAll() {
        List<CustomerManager> customerManagersList = customerManagerService.getAll();
        return customerManagersList;
    }

}
