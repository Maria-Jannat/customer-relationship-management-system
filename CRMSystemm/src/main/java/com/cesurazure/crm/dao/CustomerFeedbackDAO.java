package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.ICustomerFeedbackDAO;
import com.cesurazure.crm.model.CustomerFeedback;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "customerFeedbackDAO")
@Transactional
public class CustomerFeedbackDAO implements ICustomerFeedbackDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public CustomerFeedback save(CustomerFeedback t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public CustomerFeedback update(CustomerFeedback t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerFeedback delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerFeedback> getAll() {
        List<CustomerFeedback> customerFeedbacks = sessionFactory.getCurrentSession().createCriteria(CustomerFeedback.class).list();
        sessionFactory.getCurrentSession().flush();
        return customerFeedbacks;
    }

    @Override
    public CustomerFeedback getById(int id) {
        CustomerFeedback customerFeedback = (CustomerFeedback) sessionFactory.getCurrentSession().get(CustomerFeedback.class, id);
        sessionFactory.getCurrentSession().flush();
        return customerFeedback;
    }

}
