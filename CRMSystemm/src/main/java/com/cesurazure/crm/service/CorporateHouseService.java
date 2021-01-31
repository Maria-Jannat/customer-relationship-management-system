package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.ICorporateHouseDAO;
import com.cesurazure.crm.model.CorporateHouse;
import com.cesurazure.crm.service.impl.ICorporateHouseService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "corporateHouseService")
public class CorporateHouseService implements ICorporateHouseService {

    @Autowired
    ICorporateHouseDAO corporateHouseDAO;

    @Override
    public CorporateHouse save(HttpServletRequest request) {
        CorporateHouse corporateHouse = new CorporateHouse();
        corporateHouse.setCorporateHouseId(request.getParameter("corporateHouseId"));
        corporateHouse.setCorporateHouseName(request.getParameter("corporateHouseName"));
        corporateHouse.setCorporateHouseType(request.getParameter("corporateHouseType"));
        corporateHouse.setCorporateHouseTradedAs(request.getParameter("corporateHouseTradedAs"));
        corporateHouse.setCorporateHouseISIN(request.getParameter("corporateHouseISIN"));
        corporateHouse.setCorporateHouseIndustry(request.getParameter("corporateHouseIndustry"));
        corporateHouse.setCorporateHouseNumOfEmp(request.getParameter("corporateHouseNumOfEmp"));
        corporateHouse.setCorporateHouseServices(request.getParameter("corporateHouseServices"));
        corporateHouse.setCorporateHouseRevenue(request.getParameter("corporateHouseRevenue"));
        corporateHouse.setLeadSource(request.getParameter("leadSource"));
        corporateHouse.setCorporateHouseContact(request.getParameter("corporateHouseContact"));
        corporateHouse.setContactJobTitle(request.getParameter("contactJobTitle"));
        corporateHouse.setContactDepartment(request.getParameter("contactDepartment"));
        corporateHouse.setContactEmail(request.getParameter("contactEmail"));
        corporateHouse.setContactMobile(request.getParameter("contactMobile"));
        corporateHouse.setContactFax(request.getParameter("contactFax"));
        corporateHouse.setContactWebsite(request.getParameter("contactWebsite"));
        corporateHouse.setBackupContact(request.getParameter("backupContact"));
        corporateHouse.setBackupContactJobTitle(request.getParameter("backupContactJobTitle"));
        corporateHouse.setBackupContactEmail(request.getParameter("backupContactEmail"));
        corporateHouse.setBackupContactMobile(request.getParameter("backupContactMobile"));
        corporateHouse.setCorporateHouseStreet(request.getParameter("corporateHouseStreet"));
        corporateHouse.setCorporateHouseCity(request.getParameter("corporateHouseCity"));
        corporateHouse.setCorporateHouseState(request.getParameter("corporateHouseState"));
        corporateHouse.setCorporateHouseZipCode(request.getParameter("corporateHouseZipCode"));
        corporateHouse.setCorporateHouseCountry(request.getParameter("corporateHouseCountry"));
        corporateHouse.setContactStreet(request.getParameter("contactStreet"));
        corporateHouse.setContactCity(request.getParameter("contactCity"));
        corporateHouse.setContactState(request.getParameter("contactState"));
        corporateHouse.setContactZipCode(request.getParameter("contactZipCode"));
        corporateHouse.setContactCountry(request.getParameter("contactCountry"));
        corporateHouse.setCorporateHouseDescription(request.getParameter("corporateHouseDescription"));

        System.out.println("***********" + corporateHouse.getCorporateHouseName());
        System.out.println("***********" + corporateHouse.getLeadSource());
        System.out.println("***********" + corporateHouse.getCorporateHouseNumOfEmp());

        corporateHouseDAO.save(corporateHouse);
        return corporateHouse;
    }

    @Override
    public CorporateHouse update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CorporateHouse delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CorporateHouse> getAll() {
        return corporateHouseDAO.getAll();
    }

    @Override
    public CorporateHouse getById(int id) {
        return corporateHouseDAO.getById(id);
    }

}
