package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.IRatingController;
import com.cesurazure.crm.model.Rating;
import com.cesurazure.crm.model.ServiceForBusiness;
import com.cesurazure.crm.service.impl.IBusinessService;
import com.cesurazure.crm.service.impl.IRatingService;
import com.cesurazure.crm.service.impl.IServiceForBusinessService;
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
public class RatingController implements IRatingController {

    @Autowired
    IRatingService ratingService;

    @Autowired
    IServiceForBusinessService serviceForBusinessService;

    @Autowired
    IBusinessService businessService;

    @RequestMapping(value = "/rating")
    public ModelAndView rate() {
        return new ModelAndView("service/customer_service/rating");
    }

//    @RequestMapping(value = "/feedverification")
//    public ModelAndView verify() {
//        return new ModelAndView("service/customer_service/feedback_verifcation");
//    }
    @Override
    @RequestMapping(value = "/rating-save")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");

        ratingService.save(request);
        return new ModelAndView("service/customer_service/rating");
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
    public List<Rating> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/get-business-service/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getBusinessService(@PathVariable("id") int id) {

        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        ServiceForBusiness serviceForBusiness = serviceForBusinessService.getById(id);
        return g.toJson(serviceForBusiness);
    }
}
