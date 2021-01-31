package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.ICorporateHouseDAO;
import com.cesurazure.crm.model.CorporateHouse;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "corporateHouseDAO")
@Transactional
public class CorporateHouseDAO implements ICorporateHouseDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public CorporateHouse save(CorporateHouse t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public CorporateHouse update(CorporateHouse t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CorporateHouse delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CorporateHouse> getAll() {
        List<CorporateHouse> corporateHouseList = sessionFactory.getCurrentSession().createCriteria(CorporateHouse.class).list();
        sessionFactory.getCurrentSession().flush();
        return corporateHouseList;
    }

    @Override
    public CorporateHouse getById(int id) {
        CorporateHouse corporateHouse = (CorporateHouse) sessionFactory.getCurrentSession().get(CorporateHouse.class, id);
        sessionFactory.getCurrentSession().flush();
        return corporateHouse;
    }

}
