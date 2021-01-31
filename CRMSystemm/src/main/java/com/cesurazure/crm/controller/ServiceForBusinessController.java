package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.IServiceForBusinessController;
import com.cesurazure.crm.model.Business;
import com.cesurazure.crm.model.ServiceForBusiness;
import com.cesurazure.crm.service.impl.IBusinessService;
import com.cesurazure.crm.service.impl.IServiceForBusinessService;
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
public class ServiceForBusinessController implements IServiceForBusinessController {

    @Autowired
    IServiceForBusinessService serviceForBusinessService;

    @Autowired
    IBusinessService businessService;

    @Override
    @RequestMapping("/busines-service-save")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");
        serviceForBusinessService.save(request);
        return new ModelAndView("redirect:/business-service-create");
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
    public List<ServiceForBusiness> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/service-report")
    public ModelAndView report() {
        List<ServiceForBusiness> businessServicelist = serviceForBusinessService.getAll();
        List<Business> businesses = businessService.getAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("businessServicelist", businessServicelist);
        map.put("businesses", businesses);
        return new ModelAndView("service/business_service/services'_ report", "map", map);
    }

    @RequestMapping(value = "/core-service")
    public ModelAndView createCore() {
        return new ModelAndView("service/business_service/core_service");
    }

    @RequestMapping(value = "/vas")
    public ModelAndView createVAS() {
        return new ModelAndView("service/business_service/vas");
    }

    //    To create Rest API for SERVICE
    @RequestMapping(value = "/getBusinessForService/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getBusinessForService(@PathVariable("id") int id) {

        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        Business business = businessService.getById(id);
        return g.toJson(business);
    }

}
