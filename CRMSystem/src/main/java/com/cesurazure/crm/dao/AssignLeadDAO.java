/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.IAssignLeadDAO;
import com.cesurazure.crm.model.AssignLead;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Maria
 */
@Repository(value = "AssignLeadDAO")
@Transactional
public class AssignLeadDAO implements IAssignLeadDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public AssignLead save(AssignLead t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public AssignLead update(AssignLead t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AssignLead delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AssignLead> getAll() {
        List<AssignLead> assignLeadList = sessionFactory.getCurrentSession().createCriteria(AssignLead.class).list();
        sessionFactory.getCurrentSession().flush();
        return assignLeadList;
    }

    @Override
    public AssignLead getById(int id) {
        AssignLead assignLead = (AssignLead) sessionFactory.getCurrentSession().get(AssignLead.class, id);
        sessionFactory.getCurrentSession().flush();
        return assignLead;
    }

}
