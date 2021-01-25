package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.ICRMUserDAO;
import com.cesurazure.crm.model.CRMUser;
import com.cesurazure.crm.service.impl.ICRMUserService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "crmuserService")
public class CRMUserService implements ICRMUserService {

    @Autowired
    ICRMUserDAO crmuserDAO;

    @Override
    public CRMUser save(HttpServletRequest request) {
        CRMUser crmUser = new CRMUser();
        crmUser.setCrmId(request.getParameter("crmId"));
        crmUser.setCrmFirstName(request.getParameter("crmFirstName"));
        crmUser.setCrmLastName(request.getParameter("crmLastName"));
        crmUser.setRole(request.getParameter("role"));
        crmUser.setProfile(request.getParameter("profile"));
        crmUser.setCrmEmail(request.getParameter("crmEmail"));
        crmUser.setCrmMobile(request.getParameter("crmMobile"));
        crmUser.setCrmFax(request.getParameter("crmFax"));
        crmUser.setCrmWebsite(request.getParameter("crmWebsite"));
        crmUser.setDateOfBirth(request.getParameter("dateOfBirth"));
        crmUser.setCrmStreet(request.getParameter("crmStreet"));
        crmUser.setCrmCity(request.getParameter("crmCity"));
        crmUser.setCrmState(request.getParameter("crmState"));
        crmUser.setCrmZipCode(request.getParameter("crmZipCode"));
        crmUser.setCrmCountry(request.getParameter("crmCountry"));

        System.out.println("*****************" + crmUser.getCrmId());
        System.out.println("*****************" + crmUser.getCrmFirstName());

        crmuserDAO.save(crmUser);
        return crmUser;
    }

    @Override
    public CRMUser update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CRMUser delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CRMUser> getAll() {
        return crmuserDAO.getAll();
    }

    @Override
    public CRMUser getById(int id) {
        return crmuserDAO.getById(id);
    }

}
