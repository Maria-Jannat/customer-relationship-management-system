package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.IBusinessDAO;
import com.cesurazure.crm.model.Business;
import com.cesurazure.crm.service.impl.IBusinessService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "businessService")
public class BusinessService implements IBusinessService {

    @Autowired
    IBusinessDAO businessDAO;

    @Override
    public Business save(HttpServletRequest request) {
        Business business = new Business();
        business.setBusinessName(request.getParameter("businessName"));
        business.setType(request.getParameter("type"));
        business.setTradedAs(request.getParameter("tradedAs"));
        business.setIsin(request.getParameter("isin"));
        business.setIndustry(request.getParameter("industry"));
        business.setFounded(request.getParameter("founded"));
        business.setFounder(request.getParameter("founder"));
        business.setHeadquarter(request.getParameter("headquarter"));
        business.setAreaServed(request.getParameter("areaServed"));
        business.setKeyPeople(request.getParameter("keyPeople"));
        business.setServices(request.getParameter("services"));
        business.setRevenue(request.getParameter("revenue"));
        business.setBusinessNumOfEmployees(request.getParameter("businessNumOfEmployees"));
        business.setBusinessWebsite(request.getParameter("businessWebsite"));

        System.out.println("***********" + business.getBusinessName());
        System.out.println("***********" + business.getType());

        businessDAO.save(business);
        return business;
    }

    @Override
    public Business update(HttpServletRequest request) {
        Business business = new Business();
        business.setId(Integer.parseInt(request.getParameter("id")));
        business.setBusinessName(request.getParameter("businessName"));
        business.setType(request.getParameter("type"));
        business.setTradedAs(request.getParameter("tradedAs"));
        business.setIsin(request.getParameter("isin"));
        business.setIndustry(request.getParameter("industry"));
        business.setFounded(request.getParameter("founded"));
        business.setFounder(request.getParameter("founder"));
        business.setHeadquarter(request.getParameter("headquarter"));
        business.setAreaServed(request.getParameter("areaServed"));
        business.setKeyPeople(request.getParameter("keyPeople"));
        business.setServices(request.getParameter("services"));
        business.setRevenue(request.getParameter("revenue"));
        business.setBusinessNumOfEmployees(request.getParameter("businessNumOfEmployees"));
        business.setBusinessWebsite(request.getParameter("businessWebsite"));
        businessDAO.update(business);
        return business;
    }

    @Override
    public Business delete(int id) {
        return businessDAO.delete(id);
    }

    @Override
    public List<Business> getAll() {
        return businessDAO.getAll();
    }

    @Override
    public Business getById(int id) {
        return businessDAO.getById(id);
    }

}
