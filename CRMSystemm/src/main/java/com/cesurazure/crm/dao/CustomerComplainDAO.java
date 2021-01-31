package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.ICustomerComplainDAO;
import com.cesurazure.crm.model.CustomerComplain;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "customerComplainDAO")
@Transactional
public class CustomerComplainDAO implements ICustomerComplainDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public CustomerComplain save(CustomerComplain t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public CustomerComplain update(CustomerComplain t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerComplain delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerComplain> getAll() {
        List<CustomerComplain> customerComplains = sessionFactory.getCurrentSession().createCriteria(CustomerComplain.class).list();
        sessionFactory.getCurrentSession().flush();
        return customerComplains;
    }

    @Override
    public CustomerComplain getById(int id) {
        CustomerComplain customerComplain = (CustomerComplain) sessionFactory.getCurrentSession().get(CustomerComplain.class, id);
        sessionFactory.getCurrentSession().flush();
        return customerComplain;
    }

}
