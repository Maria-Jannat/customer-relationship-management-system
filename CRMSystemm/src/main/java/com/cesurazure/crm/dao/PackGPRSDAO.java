package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.IPackGPRSDAO;
import com.cesurazure.crm.model.PackGPRS;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "packGPRSDAO")
@Transactional
public class PackGPRSDAO implements IPackGPRSDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public PackGPRS save(PackGPRS t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public PackGPRS update(PackGPRS t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PackGPRS delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackGPRS> getAll() {
        List<PackGPRS> gprsList = sessionFactory.getCurrentSession().createCriteria(PackGPRS.class).list();
        sessionFactory.getCurrentSession().flush();
        return gprsList;
    }

    @Override
    public PackGPRS getById(int id) {
        PackGPRS gprs = (PackGPRS) sessionFactory.getCurrentSession().get(PackGPRS.class, id);
        sessionFactory.getCurrentSession().flush();
        return gprs;
    }

}
