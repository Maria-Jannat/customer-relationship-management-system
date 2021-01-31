package com.cesurazure.crm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RemonstranceController {

    @RequestMapping(value = "/remonstrance")
    public ModelAndView create() {
        return new ModelAndView("service/customer_service/remonstrance_create");
    }
    
    @RequestMapping(value = "/remverification")
    public ModelAndView verify() {
        return new ModelAndView("service/customer_service/remonstrance_verifcation");
    }
    
}
