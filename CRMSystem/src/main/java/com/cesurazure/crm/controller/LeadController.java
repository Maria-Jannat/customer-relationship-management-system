package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.ILeadController;
import com.cesurazure.crm.model.CRMUser;
import com.cesurazure.crm.model.Lead;
import com.cesurazure.crm.service.impl.ICRMUserService;
import com.cesurazure.crm.service.impl.ILeadService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LeadController implements ILeadController {

    @Autowired
    ILeadService leadService;

    @Autowired
    ICRMUserService crmuserService;

    @Override
    @RequestMapping(value = "/leadSave")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");

        leadService.save(request);
        return new ModelAndView("redirect:/leadreport");
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
    public List<Lead> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ModelAndView getAllCRMUser() {
        List<CRMUser> crmUserList = crmuserService.getAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("crmUserList", crmUserList);
        return new ModelAndView("/lead/lead_create", "map", map);
    }

}
