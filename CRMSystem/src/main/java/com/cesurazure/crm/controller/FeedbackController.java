package com.cesurazure.crm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FeedbackController {

    @RequestMapping(value = "/mcrm/customer-service/feedback")
    public ModelAndView create() {
        return new ModelAndView("service/customer_service/feedback_create");
    }
}
