package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.IAssignCRMDAO;
import com.cesurazure.crm.model.AssignCRM;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "assignCRMDAO")
@Transactional
public class AssignCRMDAO implements IAssignCRMDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public AssignCRM save(AssignCRM t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public AssignCRM update(AssignCRM t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AssignCRM delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AssignCRM> getAll() {
        List<AssignCRM> assignCRMList = sessionFactory.getCurrentSession().createCriteria(AssignCRM.class).list();
        sessionFactory.getCurrentSession().flush();
        return assignCRMList;
    }

    @Override
    public AssignCRM getById(int id) {
        AssignCRM assignCRM = (AssignCRM) sessionFactory.getCurrentSession().get(AssignCRM.class, id);
        sessionFactory.getCurrentSession().flush();
        return assignCRM;
    }

    @Override
    public AssignCRM getByCRMId(String crmId) {
        String hql = "from assignCRM where crmId = '"+ crmId +"'";
        
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        AssignCRM acrm = (AssignCRM) q.uniqueResult();
        System.out.println("..///////////////////// ..... " + acrm.getBusinessName());
        return acrm;
    }

}
