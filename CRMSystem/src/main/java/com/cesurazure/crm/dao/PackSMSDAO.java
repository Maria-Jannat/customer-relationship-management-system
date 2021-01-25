package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.IPackSMSDAO;
import com.cesurazure.crm.model.PackGPRS;
import com.cesurazure.crm.model.PackSMS;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "packSMSDAO")
@Transactional
public class PackSMSDAO implements IPackSMSDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public PackSMS save(PackSMS t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public PackSMS update(PackSMS t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PackSMS delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackSMS> getAll() {
        List<PackSMS> smsList = sessionFactory.getCurrentSession().createCriteria(PackSMS.class).list();
        sessionFactory.getCurrentSession().flush();
        return smsList;
    }

    @Override
    public PackSMS getById(int id) {
        PackSMS sms = (PackSMS) sessionFactory.getCurrentSession().get(PackSMS.class, id);
        sessionFactory.getCurrentSession().flush();
        return sms;
    }

}
