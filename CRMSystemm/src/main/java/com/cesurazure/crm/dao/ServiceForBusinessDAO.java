package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.IServiceForBusinessDAO;
import com.cesurazure.crm.model.ServiceForBusiness;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "serviceForBusinessDAO")
@Transactional
public class ServiceForBusinessDAO implements IServiceForBusinessDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public ServiceForBusiness save(ServiceForBusiness t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public ServiceForBusiness update(ServiceForBusiness t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServiceForBusiness delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ServiceForBusiness> getAll() {
        List<ServiceForBusiness> serviceForBusinessesList = sessionFactory.getCurrentSession().createCriteria(ServiceForBusiness.class).list();
        sessionFactory.getCurrentSession().flush();
        return serviceForBusinessesList;
    }

    @Override
    public ServiceForBusiness getById(int id) {
        ServiceForBusiness serviceForBusiness = (ServiceForBusiness) sessionFactory.getCurrentSession().get(ServiceForBusiness.class, id);
        sessionFactory.getCurrentSession().flush();
        return serviceForBusiness;
    }

}
