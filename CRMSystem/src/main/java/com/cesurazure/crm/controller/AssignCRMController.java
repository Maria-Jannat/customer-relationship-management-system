package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.IAssignCRMController;
import com.cesurazure.crm.model.AssignCRM;
import com.cesurazure.crm.model.Business;
import com.cesurazure.crm.model.CRMUser;
import com.cesurazure.crm.model.Lead;
import com.cesurazure.crm.service.impl.IAssignCRMService;
import com.cesurazure.crm.service.impl.IBusinessService;
import com.cesurazure.crm.service.impl.ICRMUserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AssignCRMController implements IAssignCRMController {

    @Autowired
    IAssignCRMService assignCRMService;

    @Autowired
    IBusinessService businessService;

    @Autowired
    ICRMUserService crmuserService;

    @Override
    @RequestMapping("/assignCRMSave")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");
//  code ..................
        assignCRMService.save(request);
        return new ModelAndView("redirect:/assignCRM");
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
    public List<AssignCRM> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //    To create Rest API
    @RequestMapping(value = "/getCRMUser/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCRMUser(@PathVariable("id") int id) {

        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        CRMUser crm = crmuserService.getById(id);
        return g.toJson(crm);
    }

    @RequestMapping(value = "/getBusiness/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getBusiness(@PathVariable("id") int id) {

        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        Business business = businessService.getById(id);
        return g.toJson(business);
    }

}
