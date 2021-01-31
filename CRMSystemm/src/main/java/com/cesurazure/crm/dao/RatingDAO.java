package com.cesurazure.crm.dao;

import com.cesurazure.crm.dao.impl.IRatingDAO;
import com.cesurazure.crm.model.Rating;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "ratingDAO")
@Transactional
public class RatingDAO implements IRatingDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Rating save(Rating t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Rating update(Rating t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rating delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rating> getAll() {
        List<Rating> ratingList = sessionFactory.getCurrentSession().createCriteria(Rating.class).list();
        sessionFactory.getCurrentSession().flush();
        return ratingList;
    }

    @Override
    public Rating getById(int id) {
        Rating rating = (Rating) sessionFactory.getCurrentSession().get(Rating.class, id);
        sessionFactory.getCurrentSession().flush();
        return rating;
    }

}
