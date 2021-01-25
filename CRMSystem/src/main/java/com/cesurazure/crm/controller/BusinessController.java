package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.IBusinessController;
import com.cesurazure.crm.model.Business;
import com.cesurazure.crm.model.CRMUser;
import com.cesurazure.crm.service.impl.IBusinessService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BusinessController implements IBusinessController {

    @Autowired
    IBusinessService businessService;

    @Override
    @RequestMapping(value = "/businessSave")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");
        Business business = businessService.save(request);

        Map<String, Object> map = new HashMap<>();
        if (business != null) {
            map.put("status", "Data Saved");
            return new ModelAndView("business/business_create", "map", map);
        } else {
            map.put("status", "Data NOT Saved");
            return new ModelAndView("business/business_create", "map", map);
        }
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
    public List<Business> getAll() {
        List<Business> businessList = businessService.getAll();
        return businessList;
    }

}
