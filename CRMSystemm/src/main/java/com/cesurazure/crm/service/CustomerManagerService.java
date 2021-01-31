package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.ICustomerManagerDAO;
import com.cesurazure.crm.model.CustomerManager;
import com.cesurazure.crm.service.impl.ICustomerManagerService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerManagerService")
public class CustomerManagerService implements ICustomerManagerService {

    @Autowired
    ICustomerManagerDAO customerManagerDAO;

    @Override
    public CustomerManager save(HttpServletRequest request) {
        CustomerManager customerManager = new CustomerManager();

        customerManager.setCmId(request.getParameter("cmId"));
        customerManager.setCmFirstName(request.getParameter("cmFirstName"));
        customerManager.setCmLastName(request.getParameter("cmLastName"));
        customerManager.setCmRole(request.getParameter("cmRole"));
        customerManager.setCmProfile(request.getParameter("cmProfile"));
        customerManager.setCmJobLocation(request.getParameter("cmJobLocation"));
        customerManager.setCmEmail(request.getParameter("cmEmail"));
        customerManager.setCmMobile(request.getParameter("cmMobile"));
        customerManager.setCmFax(request.getParameter("cmFax"));
        customerManager.setCmWebsite(request.getParameter("cmWebsite"));
        customerManager.setCmDateOfBirth(request.getParameter("cmDateOfBirth"));
        customerManager.setCmStreet(request.getParameter("cmStreet"));
        customerManager.setCmCity(request.getParameter("cmCity"));
        customerManager.setCmState(request.getParameter("cmState"));
        customerManager.setCmZipCode(request.getParameter("cmZipCode"));
        customerManager.setCmCountry(request.getParameter("cmCountry"));
        customerManager.setCmDescription(request.getParameter("cmDescription"));

        System.out.println("*****************" + customerManager.getCmId());
        System.out.println("*****************" + customerManager.getCmFirstName());

        customerManagerDAO.save(customerManager);
        return customerManager;
    }

    @Override
    public CustomerManager update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerManager delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerManager> getAll() {
        return customerManagerDAO.getAll();
    }

    @Override
    public CustomerManager getById(int id) {
        return customerManagerDAO.getById(id);
    }
}
