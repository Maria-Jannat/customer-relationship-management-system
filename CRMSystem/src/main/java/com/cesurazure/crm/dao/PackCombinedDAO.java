package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.IPackCombinedDAO;
import com.cesurazure.crm.model.PackCombined;
import com.cesurazure.crm.model.PackGPRS;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "packCombinedDAO")
@Transactional
public class PackCombinedDAO implements IPackCombinedDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public PackCombined save(PackCombined t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public PackCombined update(PackCombined t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public PackCombined delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PackCombined> getAll() {
        List<PackCombined> combinedList = sessionFactory.getCurrentSession().createCriteria(PackCombined.class).list();
        sessionFactory.getCurrentSession().flush();
        return combinedList;
    }

    @Override
    public PackCombined getById(int id) {
        PackCombined combined = (PackCombined) sessionFactory.getCurrentSession().get(PackCombined.class, id);
        sessionFactory.getCurrentSession().flush();
        return combined;
    }

}
