package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.ILeadDAO;
import com.cesurazure.crm.model.Lead;
import com.cesurazure.crm.service.impl.ILeadService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "leadService")
public class LeadService implements ILeadService {

    @Autowired
    ILeadDAO leadDAO;

    @Override
    public Lead save(HttpServletRequest request) {
        Lead lead = new Lead();
        lead.setLeadFirstName(request.getParameter("leadFirstName"));
        lead.setLeadLastName(request.getParameter("leadLastName"));
        lead.setJobTitle(request.getParameter("jobTitle"));
        lead.setLeadSource(request.getParameter("leadSource"));
        lead.setLeadStatus(request.getParameter("leadStatus"));
        lead.setLeadIndustry(request.getParameter("leadIndustry"));
        lead.setLeadCompany(request.getParameter("leadCompany"));
        lead.setLeadCompanyAnnualRevenue(request.getParameter("leadCompanyAnnualRevenue"));
        lead.setLeadCompanyNumberOfEmployees(request.getParameter("leadCompanyNumberOfEmployees"));
        lead.setLeadRating(request.getParameter("leadRating"));
        lead.setLeadEmail(request.getParameter("leadEmail"));
        lead.setLeadMobile(request.getParameter("leadMobile"));
        lead.setLeadFax(request.getParameter("leadFax"));
        lead.setLeadWebsite(request.getParameter("leadWebsite"));
        lead.setLeadStreet(request.getParameter("leadStreet"));
        lead.setLeadCity(request.getParameter("leadCity"));
        lead.setLeadState(request.getParameter("leadState"));
        lead.setLeadZipCode(request.getParameter("leadZipCode"));
        lead.setLeadCountry(request.getParameter("leadCountry"));
        lead.setLeadDescription(request.getParameter("leadDescription"));

        System.out.println("***********" + lead.getLeadFirstName());
        System.out.println("***********" + lead.getLeadSource());

        leadDAO.save(lead);
        return lead;
    }

    @Override
    public Lead update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lead delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Lead> getAll() {
        return leadDAO.getAll();
    }

    @Override
    public Lead getById(int id) {
        return leadDAO.getById(id);
    }

}
