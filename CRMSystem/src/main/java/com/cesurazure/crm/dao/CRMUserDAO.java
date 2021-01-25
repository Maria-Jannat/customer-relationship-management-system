package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.ICRMUserDAO;
import com.cesurazure.crm.model.CRMUser;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "crmuserDAO")
@Transactional
public class CRMUserDAO implements ICRMUserDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public CRMUser save(CRMUser t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public CRMUser update(CRMUser t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CRMUser delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CRMUser getById(int id) {
        CRMUser crmUser = (CRMUser) sessionFactory.getCurrentSession().get(CRMUser.class, id);
        sessionFactory.getCurrentSession().flush();
        return crmUser;
    }

    @Override
    public List<CRMUser> getAll() {
        List<CRMUser> crmUserList = sessionFactory.getCurrentSession().createCriteria(CRMUser.class).list();
        sessionFactory.getCurrentSession().flush();
        return crmUserList;
    }

}
