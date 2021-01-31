/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.ICustomerManagerDAO;
import com.cesurazure.crm.model.CRMUser;
import com.cesurazure.crm.model.CustomerManager;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "customerManagerDAO")
@Transactional
public class CustomerManagerDAO implements ICustomerManagerDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public CustomerManager save(CustomerManager t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public CustomerManager update(CustomerManager t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerManager delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerManager> getAll() {
        List<CustomerManager> customerManagersList = sessionFactory.getCurrentSession().createCriteria(CustomerManager.class).list();
        sessionFactory.getCurrentSession().flush();
        return customerManagersList;
    }

    @Override
    public CustomerManager getById(int id) {
        CustomerManager customerManager = (CustomerManager) sessionFactory.getCurrentSession().get(CustomerManager.class, id);
        sessionFactory.getCurrentSession().flush();
        return customerManager;
    }

}
