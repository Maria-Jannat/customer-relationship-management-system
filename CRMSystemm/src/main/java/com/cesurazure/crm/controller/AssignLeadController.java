package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.IAssignLeadController;
import com.cesurazure.crm.model.AssignCRM;
import com.cesurazure.crm.model.AssignLead;
import com.cesurazure.crm.model.Lead;
import com.cesurazure.crm.service.impl.IAssignCRMService;
import com.cesurazure.crm.service.impl.IAssignLeadService;
import com.cesurazure.crm.service.impl.IBusinessService;
import com.cesurazure.crm.service.impl.ICRMUserService;
import com.cesurazure.crm.service.impl.ILeadService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AssignLeadController implements IAssignLeadController {

    @Autowired
    IAssignLeadService assignLeadService;

    @Autowired
    ILeadService leadService;

    @Autowired
    IBusinessService businessService;

    @Autowired
    ICRMUserService crmuserService;

    @Autowired
    IAssignCRMService assignCRMService;

    @Override
    @RequestMapping(value = "/assignLeadSave")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");
        assignLeadService.save(request);
//         Work is not done here
        return new ModelAndView("redirect:/assignLead");
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
    public List<AssignLead> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    To create Rest API
    @RequestMapping(value = "/getLead/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getLead(@PathVariable("id") int id) {

        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        Lead lead = leadService.getById(id);
        return g.toJson(lead);
    }

    @RequestMapping(value = "/getBusineeByLead/{crmID}", method = RequestMethod.GET)
    public AssignCRM getBusineeByLead(@PathVariable("crmID") String crmID) {

        System.out.println("...................... " + crmID);
        AssignCRM crm = assignCRMService.getByCRMId(crmID);
        System.out.println(".......... " + crm.getBusinessName());
//        GsonBuilder gson = new GsonBuilder();
//        Gson g = gson.create();
//        Lead lead = leadService.getById(id);
        return crm;
    }

//YENI EFFORT 
    //    To create Rest API for ASSIGNCRM
    @RequestMapping(value = "/getAssignCRM/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAssignCRM(@PathVariable("id") int id) {

        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        AssignCRM assignCRM = assignCRMService.getById(id);
        return g.toJson(assignCRM);
    }

    @RequestMapping(value = "/assignLead")
    public ModelAndView hello5() {
        List<AssignCRM> assignCRMs = assignCRMService.getAll();
        List<Lead> leadlist = leadService.getAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("assignCRMs", assignCRMs);
        map.put("leadlist", leadlist);

        return new ModelAndView("assign/assign_lead", "map", map);
    }
}
