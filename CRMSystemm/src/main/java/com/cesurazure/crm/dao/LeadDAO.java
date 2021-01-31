package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.ILeadDAO;
import com.cesurazure.crm.model.Lead;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "leadDAO")
@Transactional
public class LeadDAO implements ILeadDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Lead save(Lead t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Lead update(Lead t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lead delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Lead> getAll() {
        List<Lead> lead = sessionFactory.getCurrentSession().createCriteria(Lead.class).list();
        sessionFactory.getCurrentSession().flush();
        return lead;
    }

    @Override
    public Lead getById(int id) {
        Lead lead = (Lead) sessionFactory.getCurrentSession().get(Lead.class, id);
        sessionFactory.getCurrentSession().flush();
        return lead;
    }

}
