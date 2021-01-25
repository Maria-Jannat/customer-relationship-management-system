package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.IAssignLeadDAO;
import com.cesurazure.crm.model.AssignLead;
import com.cesurazure.crm.service.impl.IAssignLeadService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "assignLeadService")
public class AssignLeadService implements IAssignLeadService {

    @Autowired
    IAssignLeadDAO assignLeadDAO;

    @Override
    public AssignLead save(HttpServletRequest request) {
        AssignLead assignLead = new AssignLead();
//        Lead Info
        assignLead.setLeadFirstName(request.getParameter("leadFirstName"));
        assignLead.setLeadLastName(request.getParameter("leadLastName"));
        assignLead.setJobTitle(request.getParameter("jobTitle"));
        assignLead.setLeadSource(request.getParameter("leadSource"));
        assignLead.setLeadStatus(request.getParameter("leadStatus"));
        assignLead.setLeadIndustry(request.getParameter("leadIndustry"));
        assignLead.setLeadCompany(request.getParameter("leadCompany"));
        assignLead.setLeadCompanyAnnualRevenue(request.getParameter("leadCompanyAnnualRevenue"));
        assignLead.setLeadCompanyNumberOfEmployees(request.getParameter("leadCompanyNumberOfEmployees"));
        assignLead.setLeadRating(request.getParameter("leadRating"));
        assignLead.setLeadEmail(request.getParameter("leadEmail"));
        assignLead.setLeadMobile(request.getParameter("leadMobile"));
        assignLead.setLeadFax(request.getParameter("leadFax"));
        assignLead.setLeadWebsite(request.getParameter("leadWebsite"));
        assignLead.setLeadStreet(request.getParameter("leadStreet"));
        assignLead.setLeadCity(request.getParameter("leadCity"));
        assignLead.setLeadState(request.getParameter("leadState"));
        assignLead.setLeadZipCode(request.getParameter("leadZipCode"));
        assignLead.setLeadCountry(request.getParameter("leadCountry"));
        assignLead.setLeadDescription(request.getParameter("leadDescription"));
//      CRM Field
        assignLead.setCrmId(request.getParameter("crmId"));
        assignLead.setCrmFirstName(request.getParameter("crmFirstName"));
        assignLead.setCrmLastName(request.getParameter("crmLastName"));
        assignLead.setRole(request.getParameter("role"));
        assignLead.setProfile(request.getParameter("profile"));
        assignLead.setCrmEmail(request.getParameter("crmEmail"));
        assignLead.setCrmMobile(request.getParameter("crmMobile"));
        assignLead.setCrmFax(request.getParameter("crmFax"));
        assignLead.setCrmWebsite(request.getParameter("crmWebsite"));
        assignLead.setDateOfBirth(request.getParameter("dateOfBirth"));
        assignLead.setCrmStreet(request.getParameter("crmStreet"));
        assignLead.setCrmCity(request.getParameter("crmCity"));
        assignLead.setCrmState(request.getParameter("crmState"));
        assignLead.setCrmZipCode(request.getParameter("crmZipCode"));
        assignLead.setCrmCountry(request.getParameter("crmCountry"));
//        Business Field
        assignLead.setBusinessName(request.getParameter("businessName"));
        assignLead.setType(request.getParameter("type"));
        assignLead.setTradedAs(request.getParameter("tradedAs"));
        assignLead.setIsin(request.getParameter("isin"));
        assignLead.setIndustry(request.getParameter("industry"));
        assignLead.setFounded(request.getParameter("founded"));
        assignLead.setFounder(request.getParameter("founder"));
        assignLead.setHeadquarter(request.getParameter("headquarter"));
        assignLead.setAreaServed(request.getParameter("areaServed"));
        assignLead.setKeyPeople(request.getParameter("keyPeople"));
        assignLead.setServices(request.getParameter("services"));
        assignLead.setRevenue(request.getParameter("revenue"));
        assignLead.setBusinessNumOfEmployees(request.getParameter("businessNumOfEmployees"));
        assignLead.setBusinessWebsite(request.getParameter("businessWebsite"));

        System.out.println("**********" + assignLead.getBusinessName());
        System.out.println("**********" + assignLead.getCrmFirstName());
        System.out.println("**********" + assignLead.getCrmLastName());
        System.out.println("**********" + assignLead.getLeadFirstName());
        System.out.println("**********" + assignLead.getLeadEmail());

        assignLeadDAO.save(assignLead);
        return assignLead;
    }

    @Override
    public AssignLead update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AssignLead delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AssignLead> getAll() {
        return assignLeadDAO.getAll();
    }

    @Override
    public AssignLead getById(int id) {
        return assignLeadDAO.getById(id);
    }

}
