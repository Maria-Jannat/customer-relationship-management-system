package com.cesurazure.crm.service;

import com.cesurazure.crm.dao.impl.IRatingDAO;
import com.cesurazure.crm.model.Rating;
import com.cesurazure.crm.service.impl.IRatingService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "ratingService")
public class RatingService implements IRatingService {

    @Autowired
    IRatingDAO ratingDAO;

    @Override
    public Rating save(HttpServletRequest request) {
        Rating rating = new Rating();
        rating.setRatingPoint(Integer.parseInt(request.getParameter("ratingPoint")));
        
//        SERVICE INFO
        rating.setServiceCode(request.getParameter("serviceCode"));
        rating.setServiceType(request.getParameter("serviceType"));
        rating.setServiceName(request.getParameter("serviceName"));
        rating.setServiceRate(request.getParameter("serviceRate"));
        rating.setServiceStatus(request.getParameter("serviceStatus"));
        rating.setServiceDescription(request.getParameter("serviceDescription"));

//        BUSINESS INFO
        rating.setBusinessName(request.getParameter("businessName"));
        rating.setType(request.getParameter("type"));
        rating.setTradedAs(request.getParameter("tradedAs"));
        rating.setIsin(request.getParameter("isin"));
        rating.setIndustry(request.getParameter("industry"));
        rating.setFounded(request.getParameter("founded"));
        rating.setFounder(request.getParameter("founder"));
        rating.setHeadquarter(request.getParameter("headquarter"));
        rating.setAreaServed(request.getParameter("areaServed"));
        rating.setKeyPeople(request.getParameter("keyPeople"));
        rating.setServices(request.getParameter("services"));
        rating.setRevenue(request.getParameter("revenue"));
        rating.setBusinessNumOfEmployees(request.getParameter("businessNumOfEmployees"));
        rating.setBusinessWebsite(request.getParameter("businessWebsite"));

        System.out.println("*****************" + rating.getServiceName());
        System.out.println("*****************" + rating.getType());

        ratingDAO.save(rating);
        return rating;
    }

    @Override
    public Rating update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rating delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rating> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rating getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
