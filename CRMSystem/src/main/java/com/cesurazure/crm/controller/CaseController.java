package com.cesurazure.crm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CaseController {

    @RequestMapping(value = "/casecreate")
    public ModelAndView create() {
        return new ModelAndView("service/case_create");
    }

    @RequestMapping(value = "/casereport")
    public ModelAndView report() {
        return new ModelAndView("service/case_report");
    }
}
