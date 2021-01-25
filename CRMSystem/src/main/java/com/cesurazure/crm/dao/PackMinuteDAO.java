package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.IPackMinuteDAO;
import com.cesurazure.crm.model.PackGPRS;
import com.cesurazure.crm.model.PackMinute;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "packMinuteDAO")
@Transactional
public class PackMinuteDAO implements IPackMinuteDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public PackMinute save(PackMinute t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public PackMinute update(PackMinute t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PackMinute delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackMinute> getAll() {
        List<PackMinute> minList = sessionFactory.getCurrentSession().createCriteria(PackMinute.class).list();
        sessionFactory.getCurrentSession().flush();
        return minList;
    }

    @Override
    public PackMinute getById(int id) {
        PackMinute minutes = (PackMinute) sessionFactory.getCurrentSession().get(PackMinute.class, id);
        sessionFactory.getCurrentSession().flush();
        return minutes;
    }

}
