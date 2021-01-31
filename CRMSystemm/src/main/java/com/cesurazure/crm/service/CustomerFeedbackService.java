package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.ICustomerFeedbackDAO;
import com.cesurazure.crm.model.CustomerFeedback;
import com.cesurazure.crm.service.impl.ICustomerFeedbackService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerFeedbackService")
public class CustomerFeedbackService implements ICustomerFeedbackService {

    @Autowired
    ICustomerFeedbackDAO customerFeedbackDAO;

    @Override
    public CustomerFeedback save(HttpServletRequest request) {
        CustomerFeedback customerFeedback = new CustomerFeedback();
        customerFeedback.setCustomerMobile(request.getParameter("customerMobile"));
        customerFeedback.setCustomerEmail(request.getParameter("customerEmail"));
        customerFeedback.setCustomerOpinionOnServices(request.getParameter("customerOpinionOnServices"));
        customerFeedback.setCustomerOpinionReason(request.getParameter("customerOpinionReason"));
        customerFeedback.setCustomerSatisfactionLevel(request.getParameter("customerSatisfactionLevel"));
        customerFeedback.setCustomerOtherOpinion(request.getParameter("customerOtherOpinion"));
        customerFeedback.setCustomerAudioClip(request.getParameter("customerAudioClip"));
//        SERVICE INFO
        customerFeedback.setServiceCode(request.getParameter("serviceCode"));
        customerFeedback.setServiceType(request.getParameter("serviceType"));
        customerFeedback.setServiceName(request.getParameter("serviceName"));
        customerFeedback.setServiceName(request.getParameter("serviceRate"));
        customerFeedback.setServiceStatus(request.getParameter("serviceStatus"));
        customerFeedback.setServiceDescription(request.getParameter("serviceDescription"));

//        BUSINESS INFO
        customerFeedback.setBusinessName(request.getParameter("businessName"));
        customerFeedback.setType(request.getParameter("type"));
        customerFeedback.setTradedAs(request.getParameter("tradedAs"));
        customerFeedback.setIsin(request.getParameter("isin"));
        customerFeedback.setIndustry(request.getParameter("industry"));
        customerFeedback.setFounded(request.getParameter("founded"));
        customerFeedback.setFounder(request.getParameter("founder"));
        customerFeedback.setHeadquarter(request.getParameter("headquarter"));
        customerFeedback.setAreaServed(request.getParameter("areaServed"));
        customerFeedback.setKeyPeople(request.getParameter("keyPeople"));
        customerFeedback.setServices(request.getParameter("services"));
        customerFeedback.setRevenue(request.getParameter("revenue"));
        customerFeedback.setBusinessNumOfEmployees(request.getParameter("businessNumOfEmployees"));
        customerFeedback.setBusinessWebsite(request.getParameter("businessWebsite"));

        customerFeedbackDAO.save(customerFeedback);
        return customerFeedback;
    }

    @Override
    public CustomerFeedback update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerFeedback delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerFeedback> getAll() {
        return customerFeedbackDAO.getAll();
    }

    @Override
    public CustomerFeedback getById(int id) {
        return customerFeedbackDAO.getById(id);
    }

}
