package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.ICustomerComplainDAO;
import com.cesurazure.crm.model.CustomerComplain;
import com.cesurazure.crm.service.impl.ICustomerComplainService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerComplainService")
public class CustomerComplainService implements ICustomerComplainService {

    @Autowired
    ICustomerComplainDAO customerComplainDAO;

    @Override
    public CustomerComplain save(HttpServletRequest request) {
        CustomerComplain customerComplain = new CustomerComplain();
        customerComplain.setCustomerComplainCode(request.getParameter("customerComplainCode"));
        customerComplain.setCustomerComplainTitle(request.getParameter("customerComplainTitle"));
        customerComplain.setCustomerComplainDetails(request.getParameter("customerComplainDetails"));
        customerComplain.setCustomerMobile(request.getParameter("customerMobile"));
        customerComplain.setCustomerEmail(request.getParameter("customerEmail"));

//        SERVICE INFO
        customerComplain.setServiceCode(request.getParameter("serviceCode"));
        customerComplain.setServiceType(request.getParameter("serviceType"));
        customerComplain.setServiceName(request.getParameter("serviceName"));
        customerComplain.setServiceRate(request.getParameter("serviceRate"));
        customerComplain.setServiceStatus(request.getParameter("serviceStatus"));
        customerComplain.setServiceDescription(request.getParameter("serviceDescription"));

//        BUSINESS INFO
        customerComplain.setBusinessName(request.getParameter("businessName"));
        customerComplain.setType(request.getParameter("type"));
        customerComplain.setTradedAs(request.getParameter("tradedAs"));
        customerComplain.setIsin(request.getParameter("isin"));
        customerComplain.setIndustry(request.getParameter("industry"));
        customerComplain.setFounded(request.getParameter("founded"));
        customerComplain.setFounder(request.getParameter("founder"));
        customerComplain.setHeadquarter(request.getParameter("headquarter"));
        customerComplain.setAreaServed(request.getParameter("areaServed"));
        customerComplain.setKeyPeople(request.getParameter("keyPeople"));
        customerComplain.setServices(request.getParameter("services"));
        customerComplain.setRevenue(request.getParameter("revenue"));
        customerComplain.setBusinessNumOfEmployees(request.getParameter("businessNumOfEmployees"));
        customerComplain.setBusinessWebsite(request.getParameter("businessWebsite"));

        customerComplainDAO.save(customerComplain);
        return customerComplain;
    }

    @Override
    public CustomerComplain update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerComplain delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerComplain> getAll() {
        return customerComplainDAO.getAll();
    }

    @Override
    public CustomerComplain getById(int id) {
        return customerComplainDAO.getById(id);
    }

}
