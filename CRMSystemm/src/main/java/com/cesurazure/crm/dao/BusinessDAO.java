package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.IBusinessDAO;
import com.cesurazure.crm.model.Business;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "businessDAO")
@Transactional
public class BusinessDAO implements IBusinessDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Business save(Business t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Business update(Business t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Business delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Business> getAll() {
        List<Business> businessList = sessionFactory.getCurrentSession().createCriteria(Business.class).list();
        sessionFactory.getCurrentSession().flush();
        return businessList;
    }

    @Override
    public Business getById(int id) {
        Business business = (Business) sessionFactory.getCurrentSession().get(Business.class, id);
        sessionFactory.getCurrentSession().flush();
        return business;
    }

}
