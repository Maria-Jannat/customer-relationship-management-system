package com.cesurazure.crm.controller;

import com.cesurazure.crm.controller.impl.ICustomerFeedbackController;
import com.cesurazure.crm.model.CustomerFeedback;
import com.cesurazure.crm.service.impl.ICustomerFeedbackService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomerFeedbackController implements ICustomerFeedbackController {

    @Autowired
    ICustomerFeedbackService customerFeedbackService;

    @RequestMapping(value = "/feedback")
    public ModelAndView create() {
        return new ModelAndView("service/customer_service/feedback_create");
    }

    @RequestMapping(value = "/feedverification")
    public ModelAndView verify(HttpServletRequest request) {
        String s = request.getParameter("phoneNumber");
        System.out.println("................................ " +s);
        return new ModelAndView("service/customer_service/feedback_verifcation");
    }

    @Override
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");

        customerFeedbackService.save(request);
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
    public List<CustomerFeedback> getAll() {
        List<CustomerFeedback> customerFeedbacksList = customerFeedbackService.getAll();
        return customerFeedbacksList;
    }
}
