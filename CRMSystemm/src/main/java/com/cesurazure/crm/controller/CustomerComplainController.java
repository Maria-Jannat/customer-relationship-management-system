package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.ICustomerComplainController;
import com.cesurazure.crm.model.CustomerComplain;
import com.cesurazure.crm.model.CustomerFeedback;
import com.cesurazure.crm.service.impl.ICustomerComplainService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomerComplainController implements ICustomerComplainController {

    @Autowired
    ICustomerComplainService customerComplainService;

//        @RequestMapping(value = "/casecreate")
//    public ModelAndView create() {
//        return new ModelAndView("service/case_create");
//    }
//    @RequestMapping(value = "/casereport")
//    public ModelAndView report() {
//        return new ModelAndView("service/case_report");
//    }
    @Override
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");

        customerComplainService.save(request);
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
    public List<CustomerComplain> getAll() {
        List<CustomerComplain> customerComplains = customerComplainService.getAll();
        return customerComplains;
    }

}
