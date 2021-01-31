package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.IAssignCRMDAO;
import com.cesurazure.crm.model.AssignCRM;
import com.cesurazure.crm.service.impl.IAssignCRMService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "assignCRMService")
public class AssignCRMService implements IAssignCRMService {

    @Autowired
    IAssignCRMDAO assignCRMDAO;

    @Override
    public AssignCRM save(HttpServletRequest request) {
        AssignCRM assignCRM = new AssignCRM();
        assignCRM.setBusinessName(request.getParameter("businessName"));
        assignCRM.setType(request.getParameter("type"));
        assignCRM.setTradedAs(request.getParameter("tradedAs"));
        assignCRM.setIsin(request.getParameter("isin"));
        assignCRM.setIndustry(request.getParameter("industry"));
        assignCRM.setFounded(request.getParameter("founded"));
        assignCRM.setFounder(request.getParameter("founder"));
        assignCRM.setHeadquarter(request.getParameter("headquarter"));
        assignCRM.setAreaServed(request.getParameter("areaServed"));
        assignCRM.setKeyPeople(request.getParameter("keyPeople"));
        assignCRM.setServices(request.getParameter("services"));
        assignCRM.setRevenue(request.getParameter("revenue"));
        assignCRM.setBusinessNumOfEmployees(request.getParameter("businessNumOfEmployees"));
        assignCRM.setBusinessWebsite(request.getParameter("businessWebsite"));
//      CRM Field
        assignCRM.setCrmId(request.getParameter("crmId"));
        assignCRM.setCrmFirstName(request.getParameter("crmFirstName"));
        assignCRM.setCrmLastName(request.getParameter("crmLastName"));
        assignCRM.setRole(request.getParameter("role"));
        assignCRM.setProfile(request.getParameter("profile"));
        assignCRM.setCrmEmail(request.getParameter("crmEmail"));
        assignCRM.setCrmMobile(request.getParameter("crmMobile"));
        assignCRM.setCrmFax(request.getParameter("crmFax"));
        assignCRM.setCrmWebsite(request.getParameter("crmWebsite"));
        assignCRM.setDateOfBirth(request.getParameter("dateOfBirth"));
        assignCRM.setCrmStreet(request.getParameter("crmStreet"));
        assignCRM.setCrmCity(request.getParameter("crmCity"));
        assignCRM.setCrmState(request.getParameter("crmState"));
        assignCRM.setCrmZipCode(request.getParameter("crmZipCode"));
        assignCRM.setCrmCountry(request.getParameter("crmCountry"));

        System.out.println("**********" + assignCRM.getBusinessName());
        System.out.println("**********" + assignCRM.getCrmFirstName());
        System.out.println("**********" + assignCRM.getCrmLastName());

        assignCRMDAO.save(assignCRM);
        return assignCRM;
    }

    @Override
    public AssignCRM update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AssignCRM delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AssignCRM> getAll() {
        return assignCRMDAO.getAll();
    }

    @Override
    public AssignCRM getById(int id) {
        return assignCRMDAO.getById(id);
    }

    @Override
    public AssignCRM getByCRMId(String crmId) {
        return assignCRMDAO.getByCRMId(crmId);
    }

}
